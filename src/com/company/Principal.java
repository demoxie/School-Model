package com.company;

import EmailSenderServices.EmailSender;
import StaffServices.PrincipalServices;
import enums.StaffRoles;

public class Principal extends Staff{
    private final StaffRoles role;
    private EmailSender emailSender;
    private final String principalEmailAddress;
    private PrincipalServices principalServices;
    public Principal(String name, Integer age, Integer yearsOfExperience, String discipline, Double salary) {
        super(name, age, yearsOfExperience, discipline, salary);
        this.role = StaffRoles.PRINCIPAL;
        this.principalEmailAddress = "mrballa@gmail.com";

    }

    @Override
    public String toString() {
        return "Principal{" +
                "role=" + role +
                ", emailSender=" + emailSender +
                ", principalEmailAddress='" + principalEmailAddress + '\'' +
                ", principalServices=" + principalServices +
                '}';
    }

    public StaffRoles getRole() {
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

    public String getPrincipalEmailAddress() {
        return principalEmailAddress;
    }
}
