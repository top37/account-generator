package com.sq.account.generator.ias;

import com.sq.account.generator.model.AccountIn;
import com.sq.account.generator.model.AccountNew;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public interface IdataStore {
    //压缩
    Map<String,String> m = new LinkedHashMap();
    //去重:方法 k,v颠倒
    Map<String,String> m1 = new LinkedHashMap();
    //承装AccountIn对象，key与压缩m 保持一致
    Map<String,List<AccountIn>> m2 = new LinkedHashMap();

    //压缩
    Map<String,String> am = new LinkedHashMap();
    //去重:方法 k,v颠倒
    Map<String,String> am1 = new LinkedHashMap();

    Map<String,AccountNew> chm = new LinkedHashMap();
}
