package com.sq.account.generator.model;

public class AccountCd {
    private Long a;

    private String b;

    private String c;

    private String d;

    private String e;

    private String f;

    public Long getA() {
        return a;
    }

    public void setA(Long a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b == null ? null : b.trim();
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c == null ? null : c.trim();
    }

    public String getD() {
        return d;
    }

    public void setD(String d) {
        this.d = d == null ? null : d.trim();
    }

    public String getE() {
        return e;
    }

    public void setE(String e) {
        this.e = e == null ? null : e.trim();
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f == null ? null : f.trim();
    }
}