package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student
{
    public Student(int id, String name, int marks)
    {
        this.id = id;
        this.name=name;
        this.marks=marks;
    }
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    private String name;
    private int marks;
}



public class StreamDemo {

    public static void main(String[] args) {

        List<Student> student = new ArrayList<>();
        student.add(new Student(1,"Arun",89));
        student.add(new Student(23, "Naresh",61));
        student.add(new Student(54, "Alok", 97));
        Map<Integer, Integer> map = student.stream().collect(Collectors.toMap(student1->student1.getId(), student2->student2.getMarks()));
        System.out.println(map);

    }

}