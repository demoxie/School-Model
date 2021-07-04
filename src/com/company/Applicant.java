package com.company;

import ApplicantService.ApplicantService;

public class Applicant implements ApplicantService {
    private String studentName;
    private Integer age;
    private String previousClass;
    private String intendedClassForAdmission;

    public Applicant(String studentName, Integer age, String previousClass, String intendedClassForAdmission) {
        this.studentName = studentName;
        this.age = age;
        this.previousClass = previousClass;
        this.intendedClassForAdmission = intendedClassForAdmission;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPreviousClass() {
        return previousClass;
    }

    public void setPreviousClass(String previousClass) {
        this.previousClass = previousClass;
    }

    public String getIntendedClassForAdmission() {
        return intendedClassForAdmission;
    }

    public void setIntendedClassForAdmission(String intendedClassForAdmission) {
        this.intendedClassForAdmission = intendedClassForAdmission;
    }

    @Override
    public void apply(School school, String studentName, Integer age, String previousClass, String intendedClassForAdmission) {

    }
}
