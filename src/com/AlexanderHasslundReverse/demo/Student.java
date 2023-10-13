package com.AlexanderHasslundReverse.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Student {

    String name;
    int age;

    boolean isTired;

    public Student(String name, int age, boolean isTired) {
        this.name = name;
        this.age = age;
        this.isTired = isTired;
    }


    public void studentArrayList() {

        List<Student> studentList = new ArrayList<>();
        studentList.add(0, new Student("Benny", 30,true));
        studentList.add(1, new Student("Frida", 28,false));

        for (int i = 0; i < studentList.size();i++) {
            System.out.println(studentList.get(i));
        }
        System.out.println("\n");
        Collections.swap(studentList,0,1);
       // System.out.println(studentList);

        for (int i = 0; i < studentList.size();i++) {
            System.out.println(studentList.get(i));
        }
    }

    @Override
    public String toString() {
        return
                "name " + name + " || " +
                " age " + age + " || " +
                " isTired " + isTired
                ;
    }
}
