package com.git;

public class Student {
    private String name;
    private int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("My name is " + name + ", And my age is " + age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}