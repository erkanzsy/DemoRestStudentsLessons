package com.erkan.model;

import java.util.List;

public class Student {
    private int id;
    private String name;
    private String surname;

    private String department;

    private List<String> lessons;

    public Student() {
    }

    public Student(int id, String name, String surname, String department) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.department = department;
    }

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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getLessons() {
        return lessons;
    }

    public void setLessons(List<String> lessons) {
        this.lessons = lessons;
    }
}
