package com.joel.lektion_3.models;

public class Student {
    private String name;
    public int age;
    public int doubleMyAge(int age){
        return age * 2;
    }
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

