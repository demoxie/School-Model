package com.company;

public class Class {
    protected String className;
    protected Integer classID;

    public Class(String className, Integer classID) {
        this.className = className;
        this.classID = classID;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public Integer getClassID() {
        return classID;
    }

    public void setClassID(Integer classID) {
        this.classID = classID;
    }
}
