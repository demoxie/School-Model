package com.company;

import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Principal mrBen = new Principal("Mr Ben Kwams",40,15,"Inter Science",10000D);
        //School agmodern = new School("AG Modern","Ashakacem",mrBen,);
        //mrBen.setName("Rev Ihemmadu");
        Teacher chidimma = new Teacher("Chidimma",20,3,"Chemical Engineering",12000D);
        Subject maths = new Subject("Mathematics",45,chidimma);
        Class primary2 = new Class("Primary 5",89);
        TreeMap<String,Subject> st = new TreeMap<>();
        st.put(maths.getSubjectName(),maths);
        Student favour = new Student("Favour Levi",15,"Male",23,40,st);
        System.out.println(favour);
    }
}
