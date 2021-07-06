package com.company;

import ApplicantService.ApplicantService;

import java.util.HashMap;
import java.util.Map;

public class Applicant implements ApplicantService {
    private String applicantName;
    private Integer age;
    private String gender;
    private String previousClass;
    private String intendedClassForAdmission;
    private String parentEmail;

    public Applicant(String studentName, Integer age,String gender, String previousClass, String intendedClassForAdmission,String parentEmail) {
        this.applicantName = studentName;
        this.age = age;
        this.gender = gender;
        this.previousClass = previousClass;
        this.intendedClassForAdmission = intendedClassForAdmission;
        this.parentEmail = parentEmail;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "applicantName='" + applicantName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", previousClass='" + previousClass + '\'' +
                ", intendedClassForAdmission='" + intendedClassForAdmission + '\'' +
                ", parentEmail='" + parentEmail + '\'' +
                '}';
    }

    public String getParentEmail() {
        return parentEmail;
    }

    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
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
    public Map<String, String> apply() {
        Map<String,String> profile = new HashMap<>();
        profile.put("Name",this.applicantName);
        profile.put("Age",Integer.toString(this.age));
        profile.put("Gender",this.gender);
        profile.put("Previous Class",this.previousClass);
        profile.put("Class applying for",this.intendedClassForAdmission);
        profile.put("Parent's Email",this.intendedClassForAdmission);
        return profile;
    }
}
