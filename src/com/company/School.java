package com.company;

import enums.TypeOfStaff;

import java.util.*;

public class School {
    public String schoolName;
    public String schoolAddress;
    public TypeOfStaff schoolPrincipal;
    private TreeMap<String,Integer> listOfDepartments;
    private final TreeMap<String,Integer> listOfClasses;
    private Map<Staff, TypeOfStaff> listOfStaffs;

    public School(String schoolName, String schoolAddress) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
        this.schoolPrincipal = TypeOfStaff.PRINCIPAL;
        this.listOfDepartments = new TreeMap<>();
        this.listOfClasses = new TreeMap<>();
        this.listOfStaffs = new HashMap<>();
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolAddress() {
        return schoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        this.schoolAddress = schoolAddress;
    }

    public TypeOfStaff getSchoolPrincipal() {
        return schoolPrincipal;
    }

    public void setSchoolPrincipal(TypeOfStaff schoolPrincipal) {
        this.schoolPrincipal = schoolPrincipal;
    }

    public TreeMap<String, Integer> getListOfDepartments() {
        return listOfDepartments;
    }

    public void setListOfDepartments(TreeMap<String, Integer> listOfDepartments) {
        this.listOfDepartments = listOfDepartments;
    }

    public TreeMap<String, Integer> getListOfClasses() {
        return listOfClasses;
    }

    protected TypeOfStaff addStaff(Staff staff, TypeOfStaff role){
        return listOfStaffs.put(staff,role);
    }
    protected String  viewSchoolProfile(){
        return schoolName+"\n"+schoolAddress+"\n"+schoolPrincipal+"\n"+listOfClasses+"\n"+listOfDepartments+
                listOfClasses+"\n"+listOfStaffs;
    }
}
