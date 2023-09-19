package com.joel.lektion_3;

import com.joel.lektion_3.models.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Student bob = new Student("Bob", new Random().nextInt(50), false);
        bob.print();
        if (bob.age > 0){
            System.out.println(bob.doubleMyAge(bob.age) + " Is double Bobs age");
        }
        else {
            System.out.println("bob is baby");
        }

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            studentList.add(new Student("Bobby", new Random().nextInt(100), new Random().nextBoolean()));
        }
        for (Student bobby : studentList) {
            bobby.print();
        }
    }
}
