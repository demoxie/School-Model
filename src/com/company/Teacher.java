package com.company;

import Exceptions.AlreadyTeachingThisSubject;
import Exceptions.TryingToTeachTheWrongSubject;
import Service_Implementations.TeacherServiceImpl;
import StaffServices.TeacherService;
import enums.StaffRoles;

import java.util.HashMap;
import java.util.Map;

public class Teacher extends Staff implements TeacherService {
    private final StaffRoles role;
    private Map<String,String> listOfSubjectsTeaching;
    private TeacherServiceImpl teacherService;
    private Departments departments;
    public Teacher(String name, Integer age, Integer yearsOfExperience, String discipline, Double salary) {
        super(name, age, yearsOfExperience, discipline, salary);
        this.role = StaffRoles.TEACHER;
        this.listOfSubjectsTeaching = new HashMap<>();

    }

    @Override
    public String toString() {
        return "Teacher{" +
                "role=" + role +
                ", listOfSubjectsTeaching=" + listOfSubjectsTeaching +
                ", teacherService=" + teacherService +
                ", departments=" + departments +
                '}';
    }

    public Map<String,String> getListOfSubjectsTeaching() {
        return listOfSubjectsTeaching;
    }

    public void setListOfSubjectsTeaching(Map<String,String>  listOfSubjectsTeaching) {
        this.listOfSubjectsTeaching = listOfSubjectsTeaching;
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
    public void teachACourse(Subject subject, String subjectName) throws TryingToTeachTheWrongSubject {
        if(!departments.getListOfSubjects().containsKey(subjectName)){
            if(!this.listOfSubjectsTeaching.get(subjectName).equals(subjectName)){
                throw new AlreadyTeachingThisSubject();
            }else{
                teacherService.teachACourse(subject,subjectName);
            }
        }else{
            throw new TryingToTeachTheWrongSubject();
        }


    }
}
