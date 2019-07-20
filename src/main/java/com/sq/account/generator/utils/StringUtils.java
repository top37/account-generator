package com.sq.account.generator.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringUtils {

    public static final String OR = "|";

    public static String replaceBlank(String str) {
        String dest = "";
        if (str!=null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n|");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        dest = dest.replaceAll("null","");
        return dest;
    }

    public static String strC2E(String s){
        if(s == null) return "";
        if("借".equals(s)) return "Debit";
        if("贷".equals(s)) return "Credit";
        return "unknown";
    }

    public static String strRedOrBlue(String s){
        if(s == null) return "";
        if(s.contains("红字冲销")) return "Red";
        return "Blue";
    }
    public static void main(String[] args) {
        System.out.println(StringUtils.replaceBlank("just do it!"));
    }
}
