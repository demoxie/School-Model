package com.company;

import java.util.*;

public abstract class Departments extends School{
    protected String name;
    protected Integer departmentID;
    protected List<Staff> listOfStaffs;
    protected Map<String,Integer> listOfSubjects;

    public Departments(String name, Integer departmentID) {
        super();
        this.name = name;
        this.departmentID = departmentID;
        this.listOfStaffs = new ArrayList<>();
        this.listOfSubjects = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(Integer departmentID) {
        this.departmentID = departmentID;
    }

    public List<Staff> getListOfStaffs() {
        return listOfStaffs;
    }

    public void setListOfStaffs(List<Staff> listOfStaffs) {
        this.listOfStaffs = listOfStaffs;
    }
    private String departmentID(){
        Random random = new Random();
        int code = random.nextInt(1000);
        String id = forma
        return
    }
}
