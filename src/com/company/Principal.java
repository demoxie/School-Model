package com.company;

import StaffServices.PrincipalServices;
import enums.TypeOfStaff;

import java.util.TreeMap;

public class Principal extends Staff implements PrincipalServices {
    private final TypeOfStaff role;
    public Principal(String name, Integer age, Integer yearsOfExperience, String discipline, Double salary) {
        super(name, age, yearsOfExperience, discipline, salary);
        this.role = TypeOfStaff.PRINCIPAL;

    }

    public TypeOfStaff getRole() {
        return role;
    }


    @Override
    protected String getName() {
        return super.getName();
    }

    @Override
    protected void setName(String name) {
        super.setName(name);
    }

    @Override
    protected Integer getAge() {
        return super.getAge();
    }

    @Override
    protected void setAge(Integer age) {
        super.setAge(age);
    }

    @Override
    protected Integer getYearsOfExperience() {
        return super.getYearsOfExperience();
    }

    @Override
    protected void setYearsOfExperience(Integer yearsOfExperience) {
        super.setYearsOfExperience(yearsOfExperience);
    }

    @Override
    protected String getDiscipline() {
        return super.getDiscipline();
    }

    @Override
    protected void setDiscipline(String discipline) {
        super.setDiscipline(discipline);
    }

    @Override
    protected Double getSalary() {
        return super.getSalary();
    }

    @Override
    protected void setSalary(Double salary) {
        super.setSalary(salary);
    }

    @Override
    public void expelStudent(String studentID) {

    }

    @Override
    public void admitStudent(Applicant applicant) {

    }

    @Override
    public void viewStudentProfile(String studentID) {

    }

    @Override
    public void viewStudentList() {
        Departments departments = Departments;

    }
}
