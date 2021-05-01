package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student1 = new String[5];
        student1[0] = "rpasha3";
        student1[1] = "raif";
        student1[2] = "pasha";
        student1[3] = "b22";
        student1[4] = "7036787228";

        String [] student2 = {"rpasha3, raif, pasha, b22, 7037827228"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 first name = " + student1[1]);
        System.out.println("student1 last name = " + student1[2]);
        System.out.println("student1 batch number = " + student1[3]);
        System.out.println("student1 mobile number = " + student1[4]);

        System.out.println("student data length: " + student1.length);
        //check if student 1 data array contains 5 items
        //true: Student1 data array has correct length
        if (student1.length == 5) {
            System.out.println("PASS: Array has correct length");
        } else {
            System.out.println("FAIL: Array has incorrect length");
        }

        if (student1.length == student2.length) {
            System.out.println("PASS: Arrays length match");
        } else {
            System.out.println("FAIL: arrays length mismatch");
        }
        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        String mobileNum = student1[4];

    }
}
