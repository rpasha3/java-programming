package day47_constructors;

public class StudentObjects {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();

        Student st3 = new Student("Raif");
        Student st4 = new Student("Tristan");

        Student st5 = new Student("Nasiba", 28);
        Student st6 = new Student(42);
    }
}
