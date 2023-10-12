package com.AlexanderHasslund.demo;

import java.util.ArrayList;
import java.util.List;


public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setStudentList() {
        List<Student> studentList = new ArrayList<>();
        Input input = new Input();

        for (int i = 0; i < 3; i++) {
            System.out.print("Vad heter spelare " + (i+1) + "?: ");
            String inputName = input.stringInput();

            System.out.print("hur gammal är spelare " + (i+1) + "?: ");
            int inputAge = input.intInput();

            studentList.add(i,(new Student(inputName,inputAge)));
        }
        System.out.println(studentList);
        for (int i = 0; i < studentList.size();i++) {
            System.out.println(studentList.get(i));
        }
    }

    @Override
    public String toString() {
        return "Student " +
                "name='" + name + '\'' +
                ", age=" + age +
                ' ';
    }
}