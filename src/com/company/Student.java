package com.company;

import StudentService.StudentService;

import java.util.TreeMap;

public class Student implements StudentService {
    protected String name;
    protected Integer age;
    protected String gender;
    protected Integer classID;
    protected Integer studentID;
    protected TreeMap<String,Subject>  listOfSubjectsTaking;

    public Student(String name, Integer age, String gender, int classID, Integer studentID, TreeMap<String, Subject> listOfSubjectsTaking) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.classID = classID;
        this.studentID = studentID;
        this.listOfSubjectsTaking = listOfSubjectsTaking;
    }

    @Override
    public String toString() {
        return "TypeOfStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", classID=" + classID +
                ", studentID=" + studentID +
                ", listOfSubjectsTaking=" + listOfSubjectsTaking +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public Integer getClassID() {
        return classID;
    }

    public void setClassID(Integer classID) {
        this.classID = classID;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public TreeMap<String, Subject> getListOfSubjectsTaking() {
        return listOfSubjectsTaking;
    }

    public void setListOfSubjectsTaking(TreeMap<String, Subject> listOfSubjectsTaking) {
        this.listOfSubjectsTaking = listOfSubjectsTaking;
    }

    @Override
    public void takeACourse(Subject subject, String subjectName) {
        this.listOfSubjectsTaking.put(subjectName,subject);
    }
}
