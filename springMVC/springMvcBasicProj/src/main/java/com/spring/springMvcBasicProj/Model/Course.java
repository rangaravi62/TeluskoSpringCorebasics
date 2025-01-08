package com.spring.springMvcBasicProj.Model;

public class Course {
    private String cid;
    private String cname;
    private Double cprice;

    public Course(String cid, String cname, Double cprice) {
        this.cid = cid;
        this.cname = cname;
        this.cprice = cprice;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Double getCprice() {
        return cprice;
    }

    public void setCprice(Double cprice) {
        this.cprice = cprice;
    }
}
