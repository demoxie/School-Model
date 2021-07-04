package com.company;

public class Subject {
    protected String subjectName;
    protected int subjectID;
    protected Teacher staffTakingTheSubject;

    public Subject(String subjectName, int subjectID, Teacher staffTakingTheSubject) {
        this.subjectName = subjectName;
        this.subjectID = subjectID;
        this.staffTakingTheSubject = staffTakingTheSubject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", subjectID=" + subjectID +
                ", staffTakingTheSubject=" + staffTakingTheSubject +
                '}';
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(int subjectID) {
        this.subjectID = subjectID;
    }

    public Teacher getStaffTakingTheSubject() {
        return staffTakingTheSubject;
    }

    public void setStaffTakingTheSubject(Teacher staffTakingTheSubject) {
        this.staffTakingTheSubject = staffTakingTheSubject;
    }
}
