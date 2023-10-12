package com.AlexanderHasslundReverse.demo;

import java.util.ArrayList;
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


    }
}
