package com.sq.account.generator.utils;

import com.sq.account.generator.model.AccountIn;
import com.sq.account.generator.model.AccountNew;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ServiceUtils {

    private static final Logger log = LoggerFactory.getLogger(ServiceUtils.class);

    public static LinkedHashMap<String,AccountNew> m = new LinkedHashMap<>();
    private ServiceUtils(){}

    public static void service(List<AccountIn> lstAccount,Map am1,String cj,int c) {
        if(null == lstAccount || lstAccount.size() == 0) return;
        String key;
        String debitCode="",desc="",rorb="",au="",f="",g="";
        int j;//使用
        int z;//复位
        for(int i = 0;i < lstAccount.size();i++){
            AccountIn a = lstAccount.get(i);
            if(isDebit(a)){
                debitCode = a.getG();
                desc = a.getE();
                rorb = a.getH();
                au = a.getJ();
                f = a.getF();
                g = a.getG();
                //多借一贷（双借正常，超过则顺序颠倒，不影响结果） 寻至借贷点 i为最后一借
                if(i != 0 && i+1<=lstAccount.size() && isDebit(lstAccount.get(i-1)) && !isDebit(lstAccount.get(i+1))){
                    j = i;
                    z = i;
                    while (j != 0 && isDebit(lstAccount.get(j)) ){
                        if(!isDebit(lstAccount.get(j-1))) break;
                        j--;//追溯
                        key = lstAccount.get(j).getG()+lstAccount.get(z+1).getG();
                        AccountIn aj = lstAccount.get(j);
                        AccountIn az = lstAccount.get(z+1);
                        log.info(am1.get(key)+" <->  借："+lstAccount.get(j).getG()+"  辅助核算："+lstAccount.get(j).getJ()+"  摘要："+lstAccount.get(j).getE()+"  贷："+lstAccount.get(z+1).getG()+"  辅助核算："+lstAccount.get(z+1).getJ()+"  摘要："+lstAccount.get(z+1).getE());
                        AccountNew an = new AccountNew.Builder().b(cj).c("5551").d("").e("156").f("").g("("+am1.get(key)+")").h("").i("N").j("").k("").l("100").m(aj.getG()).n(StringUtils.strC2E(aj.getF())).o(StringUtils.strRedOrBlue(aj.getH())).p(aj.getE()).q("ZB"+Integer.toString(c)).r(aj.getJ()).s(az.getG()).t(StringUtils.strC2E(az.getF())).u(StringUtils.strRedOrBlue(az.getH())).v(az.getE()).w("ZB"+Integer.toString(c)).x(az.getJ()).build();
                        m.putIfAbsent(an.toString(),an);
                    }

                }
            }else {
                //一借多贷
                key = debitCode+a.getG();
                AccountIn az = a;
                log.info(am1.get(key)+" <->  借："+debitCode+"  辅助核算："+au+"  摘要："+desc+"  贷："+a.getG()+"  辅助核算："+a.getJ()+"  摘要："+a.getE());
                AccountNew an = new AccountNew.Builder().b(cj).c("5551").d("").e("156").f("").g("("+am1.get(key)+")").h("").i("N").j("").k("").l("100").m(g).n(StringUtils.strC2E(f)).o(StringUtils.strRedOrBlue(rorb)).p(desc).q("ZB"+Integer.toString(c)).r(au).s(az.getG()).t(StringUtils.strC2E(az.getF())).u(StringUtils.strRedOrBlue(az.getH())).v(az.getE()).w("ZB"+Integer.toString(c)).x(az.getJ()).build();
                m.putIfAbsent(an.toString(),an);
            }
        }

    }

    private static boolean isDebit(AccountIn account){
        if( "借".equals(account.getF()) ) return true;
        if( "贷".equals(account.getF()) && "22410404".equals(account.getG()) && account.getH().contains("红字冲销")) return true;
        return false;
    }

}
