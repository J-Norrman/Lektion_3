package com.joel.lektion_3.me;

public class Student {
    private String name;
    private int age;
    private boolean hair;
    public Student(String name, int age, boolean hair) {
        this.name = name;
        this.age = age;
        this.hair = hair;
    }
    public void print(){
        System.out.println(name + " is " + age + " years old, " + "has hair? " + hair);
    }
}
