package com.sq.account.generator.ias;

import com.sq.account.generator.model.AccountCd;
import com.sq.account.generator.model.AccountIn;
import com.sq.account.generator.model.AccountNew;
import com.sq.account.generator.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static com.sq.account.generator.utils.StringUtils.saveNum;

public abstract class AbsAccountGenerator {
    private static final Logger log = LoggerFactory.getLogger(AbsAccountGenerator.class);
    protected static int j;

    String k,v;

    protected List<AccountIn> lstAcc;
    protected List<AccountIn> bindkeylist;
    protected List<AccountCd> lstAcd;

    /**
     * 将 记账码文档 转成所需的Map工具结构，供 会计需求文档 使用
     * db/table : AccountCd
     * 1.压缩：
     * {
     *     论据 - 同一记账码对应着两个不同的科目；
     *     效果(非全量的压缩【∵key 有重复】，需防止value过长)
     *     eg：
     *     {
     *          k -> 2120011001,                            记账码
     *          v -> 112205016001160101                     借贷相加（①借贷：确切的说是上下相加）
     *     }
     * }
     *
     * @param lstAcd -> AccountCd
     * @param m -> am
     */
    protected void accountCodeForKJ(List<AccountCd> lstAcd, Map<String,String> m){
        for(AccountCd a : lstAcd){
            k = StringUtils.replaceBlank(a.getB());
            v = StringUtils.replaceBlank(a.getE());
            if( m.containsKey(k) && m.get(k).contains(a.getE()) ) continue;
            m.put(k,(m.get(k)+v).replaceAll("null",""));
        }
    }

    /**
     * db/table : AccountIn
     * 2.压缩：-> m
     * {
     *     论据 - 同一记账码对应着两个不同的科目，否则失效；
     *     效果(*全量的压缩【∵key 无重复】)
     * }
     * 3.重组data的结构 -> m2
     *
     * @param lstAcc -> AccountIn
     * @param m：
     *     eg：
     *     {
     *          k -> 费项计提5计提应收利息
     *          v -> 【易卡-众邦银行】**年**月**日计提收入借11220501应收账款\平台服务费\易卡易卡-众邦银行XD0019业务凭证融通【易卡-众邦银行】**年**月**日计提收入贷6001160101主营业务收入\平台服务费\易卡\技术服务费易卡-众邦银行XD0019业务凭证融通
     *     }
     * @param m2：
     *      eg：
     *      {
     *          k -> 费项计提5计提应收利息
     *          v -> [
     *                  AccountIn@xx{2	费项计提	5	计提应收利息	【易卡-众邦银行】**年**月**日计提收入	借	11220501	应收账款\平台服务费\易卡	易卡-众邦银行	XD0019	业务凭证	融通}
     *                  AccountIn@yy{3	费项计提	5	计提应收利息	【易卡-众邦银行】**年**月**日计提收入	贷	6001160101	主营业务收入\平台服务费\易卡\技术服务费	易卡-众邦银行	XD0019	业务凭证	融通}
     *              ]
     *      }
     */
    protected void accountXQForKJ(List<AccountIn> lstAcc, Map<String,String> m,Map<String,List<AccountIn>> m2){
        for(AccountIn a : lstAcc){
            k = StringUtils.replaceBlank(a.getB()+a.getC()+a.getD());
            v = StringUtils.replaceBlank(a.getE()+a.getF()+a.getG()+a.getH()+a.getI()+a.getJ()+a.getK()+a.getL());
            m.put(k,(m.get(k)+v).replaceAll("null",""));
            if(m2.containsKey(k)){
                bindkeylist.add(a);
            }else {
                //保证一个key只进入一次，若无此key，初始出一个bindkeylist，并为同样的key所用
                bindkeylist = new ArrayList();
                bindkeylist.add(a);
                m2.put(k,bindkeylist);
            }

        }
    }

    /**
     * 将 记账码文档 转成所需的Map工具结构，供 会计需求文档 使用
     * db/table : AccountCd
     * 2.去重（方法：k,v颠倒） 效果：整合相同"借贷@see①"对应的不同的记账码；
     * {
     *     k -> 2241040422410301
     *     v -> 2140001005|2140002005
     * }
     * db/table : AccountIn
     * 3.去重（方法：k,v颠倒） 效果：整合相同 科目组 对应的不同的 场景；
     * {
     *     k -> 【易卡-众邦银行】**年**月**日计提收入借11220501应收账款\平台服务费\易卡易卡-众邦银行XD0019业务凭证融通【易卡-众邦银行】**年**月**日计提收入贷6001160101主营业务收入\平台服务费\易卡\技术服务费易卡-众邦银行XD0019业务凭证融通
     *     v -> 费项计提5计提应收利息|费项计提6计提信息服务费|费项计提7计提账户管理费|费项计提9计提应收滞纳金|费项计提10计提应收罚息
     * }
     * @param am 数据集
     * @param am1 结果集
     */
    protected void removeDup(Map<String,String> am, Map<String,String> am1){
        for(String a : am.keySet()){
            if(am1.containsKey(am.get(a))){
                log.debug(a +"----->"+ am1.get(am.get(a))  );
                am1.put(am.get(a),am1.get(am.get(a))+ StringUtils.OR +a);
            }else {
                am1.put(am.get(a),a);
            }
        }
    }

    /**
     * 组装chm：(去重 + 统一辅助核算)
     * {
     * 		真正插入数据库的实例;
     *      修改符合判断标准的辅助核算；
     *      判断标准：k -> (2140001005|2140002005)【易卡-众邦银行】**年**月**日收款
     *  }
     */
    protected void pkgRecord(Map<String, AccountNew> sm, Map<String,AccountNew> chm){
        String str = "";
        String str1= "";
        for(AccountNew an : sm.values()){
            if(chm.containsKey(an.getG()+an.getP())){
                log.debug(an.getW()+"   --->   "+chm.get(an.getG()+an.getP()).getW());
                str1 = an.getW();
                str = chm.get(an.getG()+an.getP()).getW();
            }

            chm.putIfAbsent(an.getG()+an.getP(),an);

            if(an.getW().equals(str1)) {
                chm.get(an.getG()+an.getP()).setW(str);
                chm.get(an.getG()+an.getP()).setQ(str);
            }
        }
    }

    protected void showDiff(Map<String,AccountNew> chm,Map<String,String> am){
        for(String k : chm.keySet()){
            rmKfromam(k,am);
        }
        for (String a : am.keySet()){
            log.info("剩余记账码："+ a +"  <->  "+ am.get(a));
        }
    }

    private void rmKfromam(String k,Map<String,String> am) {
        String[] strArr = k.replaceAll("\\(","").replaceAll("\\)","").split("\\|");
        for(String r : strArr){
            r = saveNum(r);
            am.remove(r);
        }
    }

}
