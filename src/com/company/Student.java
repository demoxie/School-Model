package com.company;

import StudentService.StudentService;

import java.util.TreeMap;

public class Student extends  Departments implements StudentService {
    protected String name;
    protected Integer age;
    protected String gender;
    protected String currentClass;
    protected String departmentName;
    protected String parentEmail;
    protected TreeMap<String,Subject>  listOfSubjectsTaking;

    public Student(String departmentName, String name, Integer age, String gender, String Class,String parentEmail) {
        this.departmentName = departmentName;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.currentClass = Class;
        this.listOfSubjectsTaking = new TreeMap<>();
        this.parentEmail = parentEmail;
    }

    public String getCurrentClass() {
        return currentClass;
    }

    public void setCurrentClass(String currentClass) {
        this.currentClass = currentClass;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    @Override
    public String toString() {
        return "TypeOfStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", classID=" + currentClass +
                ", listOfSubjectsTaking=" + listOfSubjectsTaking +
                '}';
    }

    public String getDepartmentName() {
        return name;
    }

    public void setDepartmentName(String departmentName) {
        this.name = departmentName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setClass(String aClass) {
        this.currentClass = aClass;
    }

    public TreeMap<String, Subject> getListOfSubjectsTaking() {
        return listOfSubjectsTaking;
    }

    public void setListOfSubjectsTaking(TreeMap<String, Subject> listOfSubjectsTaking) {
        this.listOfSubjectsTaking = listOfSubjectsTaking;
    }

    @Override
    public void takeACourse(Subject subject, String subjectName,String studentName) {

        this.listOfSubjectsTaking.put(subjectName,subject);
    }

}
