package day09_scanner_practice;

import java.util.Scanner;

public class PatientInformationReplit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");
        System.out.println("Enter your first name");
        String firstName = scan.next();
        System.out.println("Enter your last name");
        String lastName = scan.next();
        System.out.println("Enter your email");
        String email = scan.next();
        System.out.println("Enter your city");
        String city = scan.next();
        System.out.println("Enter your address");
        String address = scan.nextLine();
        System.out.println("Enter your zip code");
        int zipcode = scan.nextInt();
        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();
        System.out.println("Enter your personal phone number");
        long personalNumber = scan.nextLong();
        System.out.println("Enter your age");
        int age = scan.nextInt();
        System.out.println("Enter your height");
        double height = scan.nextInt();
        System.out.println("Enter your weight");
        double weight = scan.nextInt();
        System.out.println("Are you married?");
        boolean isMarried = scan.nextBoolean();
        System.out.println("***** Thank you! *****");



    }
}
