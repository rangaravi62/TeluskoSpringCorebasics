package com.spring.beans;

public class Employee {
    public int id;
    public String name;
    public Double salary;
    public String city;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public Employee(int id, String name, Double salary, String city) {
        System.out.println("Employee parametrized constructor injection!");
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.city = city;
    }

    public Employee(){
        System.out.println("Employee contructor has been called!");
    }



    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", city='" + city + '\'' +
                '}';
    }



}
