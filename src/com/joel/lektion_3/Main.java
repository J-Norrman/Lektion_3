package com.joel.lektion_3;

import com.joel.lektion_3.me.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student bob = new Student("Bob", 100, false);
        bob.print();

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            studentList.add(new Student("Bobby", new Random().nextInt(100), new Random().nextBoolean()));
        }
        for (Student bobby : studentList) {
            bobby.print();
        }
    }
}
