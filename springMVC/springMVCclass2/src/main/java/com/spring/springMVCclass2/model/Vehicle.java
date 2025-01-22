package com.spring.springMVCclass2.model;

public class Vehicle {
    private Integer id;
    private String company;
    private Double cost;
    private String country;

    public Vehicle(Integer id, String company, Double cost, String country) {
        this.id = id;
        this.company = company;
        this.cost = cost;
        this.country = country;
        Integer.MAX_VALUE
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

}
