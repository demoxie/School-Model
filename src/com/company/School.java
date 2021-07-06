package com.company;

import enums.StaffRoles;

import java.util.*;

public class School {
    public final String schoolName;
    public final String schoolAddress;
    private final StaffRoles schoolPrincipal;
    private TreeMap<String,Departments> listOfDepartments;
    private final TreeMap<String,Integer> listOfClasses;
    private final Map<String, Staff> listOfStaffs;

    public School() {
        this.schoolName = "Decagon High School";
        this.schoolAddress = "Edo State";
        this.schoolPrincipal = StaffRoles.PRINCIPAL;
        this.listOfDepartments = new TreeMap<>();
        this.listOfClasses = new TreeMap<>();
        this.listOfStaffs = new HashMap<>();
    }

    public Map<String, Staff> getListOfStaffs() {
        return listOfStaffs;
    }

    public TreeMap<String, Departments> getListOfDepartments() {
        return listOfDepartments;
    }

    public void setListOfDepartments(TreeMap<String, Departments> listOfDepartments) {
        this.listOfDepartments = listOfDepartments;
    }

    public String getSchoolName() {
        return schoolName;
    }


    public String getSchoolAddress() {
        return schoolAddress;
    }


    public StaffRoles getSchoolPrincipal() {
        return schoolPrincipal;
    }

    public TreeMap<String, Integer> getListOfClasses() {
        return listOfClasses;
    }

    protected void addStaff(Staff staff, String startName){
        listOfStaffs.put(startName,staff);
    }
    protected String  viewSchoolProfile(){
        return schoolName+"\n"+schoolAddress+"\n"+schoolPrincipal+"\n"+listOfClasses+"\n"+listOfDepartments+
                listOfClasses+"\n"+listOfStaffs;
    }
}
