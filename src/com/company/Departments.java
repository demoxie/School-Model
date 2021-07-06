package com.company;

import java.security.SecureRandom;
import java.util.*;
import java.util.stream.Collectors;

public class Departments extends School{
    protected String departmentName;
    private List<Student> listOfStudents;
    private List<Student> listOfStaffs;
    private Map<String,List<Subject>> listOfSubjects;

    public Departments() {
        this.departmentName = "";
        this.listOfStudents = new ArrayList<>();
        this.listOfSubjects = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Departments{" +
                "departmentName='" + departmentName + '\'' +
                ", listOfStudents=" + listOfStudents +
                ", listOfSubjects=" + listOfSubjects +
                '}';
    }

    public void setListOfSubjects(Map<String, List<Subject>> listOfSubjects) {
        this.listOfSubjects = listOfSubjects;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }


    public List<Student> getListOfStudents() {
        return listOfStudents;
    }

    public void setListOfStudents(List<Student> listOfStudents) {
        this.listOfStudents = listOfStudents;
    }
    protected void addSubjects(String departmentName,Subject subject){
        List<Subject> subjects = this.listOfSubjects.get(departmentName);
        if (subjects == null) {
            subjects = new ArrayList<>();
        }

        subjects.add(subject);

        this.listOfSubjects.put(departmentName, subjects);
    }
    protected Map<String, List<Subject>> getListOfSubjects(){
        return this.listOfSubjects;
    }

}
