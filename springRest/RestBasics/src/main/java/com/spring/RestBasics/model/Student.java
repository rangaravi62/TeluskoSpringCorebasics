package com.spring.RestBasics.model;

public class Student {

    private Integer id;
    private String firstName;
    private String secondName;
    private String city;

    public Student(Integer id, String firstName, String secondName, String city) {
        this.id = id;
        this.firstName = firstName;
        this.secondName = secondName;
        this.city = city;
    }

    public Student(){}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
