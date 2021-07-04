package com.company;

import StaffServices.TeacherService;
import enums.TypeOfStaff;

import java.util.HashMap;
import java.util.Map;

public class Teacher extends Staff implements TeacherService {
    private final TypeOfStaff role;
    private final Map<String,Subject> listOfSubjectsTeaching;
    public Teacher(String name, Integer age, Integer yearsOfExperience, String discipline, Double salary) {
        super(name, age, yearsOfExperience, discipline, salary);
        this.role = TypeOfStaff.ACADEMIC;
        this.listOfSubjectsTeaching = new HashMap<>();

    }
    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public Integer getAge() {
        return super.getAge();
    }

    @Override
    public void setAge(Integer age) {
        super.setAge(age);
    }

    @Override
    public Integer getYearsOfExperience() {
        return super.getYearsOfExperience();
    }

    @Override
    public void setYearsOfExperience(Integer yearsOfExperience) {
        super.setYearsOfExperience(yearsOfExperience);
    }

    @Override
    public String getDiscipline() {
        return super.getDiscipline();
    }

    @Override
    public void setDiscipline(String discipline) {
        super.setDiscipline(discipline);
    }

    @Override
    public Double getSalary() {
        return super.getSalary();
    }

    @Override
    public void setSalary(Double salary) {
        super.setSalary(salary);
    }

    @Override
    public void teachACourse(Subject subject, String subjectName) {
        this.listOfSubjectsTeaching.put(subjectName,subject);
    }
}
