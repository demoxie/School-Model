package com.company;

public class Subject {
    protected String subjectName;
    protected Teacher staffTakingTheSubject;

    public Subject(String subjectName, int subjectID, Teacher staffTakingTheSubject) {
        this.subjectName = subjectName;
        this.staffTakingTheSubject = staffTakingTheSubject;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "subjectName='" + subjectName + '\'' +
                ", staffTakingTheSubject=" + staffTakingTheSubject +
                '}';
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Teacher getStaffTakingTheSubject() {
        return staffTakingTheSubject;
    }

    public void setStaffTakingTheSubject(Teacher staffTakingTheSubject) {
        this.staffTakingTheSubject = staffTakingTheSubject;
    }
}
