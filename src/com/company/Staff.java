package com.company;


public abstract class Staff {
    private String name;
    protected Integer age;
    protected Integer yearsOfExperience;
    protected String discipline;
    protected Double salary;


    public Staff(String name, Integer age, Integer yearsOfExperience, String discipline, Double salary) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
        this.discipline = discipline;
        this.salary = salary;
    }
    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Integer getAge() {
        return age;
    }

    protected void setAge(Integer age) {
        this.age = age;
    }

    protected Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    protected void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }

    protected String getDiscipline() {
        return discipline;
    }

    protected void setDiscipline(String discipline) {
        this.discipline = discipline;
    }

    protected Double getSalary() {
        return salary;
    }

    protected void setSalary(Double salary) {
        this.salary = salary;
    }


}
