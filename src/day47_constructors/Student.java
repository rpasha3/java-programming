package day47_constructors;

public class Student {
    public Student(){
        System.out.println("No args constructor");
    }

    public Student(String name) {
        System.out.println("Student name: " + name);
    }

    public Student (int age) {
        System.out.println("Student age: " + age);
    }

    public Student(String name, int age) {
        System.out.println("Student name: " + name + "Student age: " + age);
    }
}
