package com.company;

import Exceptions.TryingToTeachTheWrongSubject;

import java.util.*;

public class Main {

    public static void main(String[] args) throws TryingToTeachTheWrongSubject {
	// write your code here
        Principal mrBen = new Principal("Mr Ben Kwams",40,15,"Inter Science",10000D);
        //School agmodern = new School("AG Modern","Ashakacem",mrBen,);
        Departments newDepartment = new Departments();
        newDepartment.setDepartmentName("Science");
        Teacher chidimma = new Teacher("Chidimma",20,3,"Chemical Engineering",12000D);
        Teacher sani = new Teacher("Sani",19,5,"Chemical Engineering",12000D);
        Subject maths = new Subject("Mathematics",45,chidimma);
        Subject physics = new Subject("Physics",45,chidimma);
        Map<String,String> sm = sani.getListOfSubjectsTeaching();
        sm.put(maths.getSubjectName(),maths.getSubjectName());
        sani.setListOfSubjectsTeaching(sm);
        newDepartment.addStaff(chidimma, chidimma.getName());
        newDepartment.addStaff(sani, sani.getName());
        newDepartment.addSubjects(newDepartment.getDepartmentName(),maths);
        System.out.println(newDepartment.getListOfSubjects());
        sani.teachACourse(physics,physics.getSubjectName());
        List<Subject> sub = new ArrayList<>();
        sub.add(maths);sub.add(physics);
        Map<String,List<Subject>> list = new HashMap<>();
        list.put(maths.getSubjectName(),sub);
        list.put(physics.getSubjectName(),sub);
        newDepartment.setListOfSubjects((list));
    }
}
