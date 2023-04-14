package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public int compareTo(Student student) {

        return this.rollNo - student.rollNo;

    }
}


public class ComparableDemo {

    public static void main(String args[])
    {

        Student s1 = new Student(12, "John");
        Student s2 = new Student(7, "Joseph");
        Student s3 = new Student(45, "Mary");

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);

        Collections.sort(studentList);

        for(Student student : studentList)
        {
            System.out.println(student.rollNo + " " + student.name);
        }

    }
}
