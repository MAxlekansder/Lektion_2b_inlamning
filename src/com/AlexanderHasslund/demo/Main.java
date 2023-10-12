package com.AlexanderHasslund.demo;

import com.AlexanderHasslund.demo.TestLists;

public class Main {

    public static void main(String[] args) {
        TestLists testLists = new TestLists();
        Student student = new Student("",0);

        testLists.arrayList();
        student.setStudentList();
    }
}