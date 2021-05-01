package day13_conditional_statements;

import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("***** WELCOME TO TD BANK ATM *****");
        System.out.println("Enter PINCODE:");
        int secretPincode = 7119;
        int inputPincode = scan.nextInt();
        if (inputPincode == secretPincode) {
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw, check balance, deposit");

        } else {
            System.out.println("Incorrect Pincode! - " + inputPincode);
            System.out.println("Please try again.");
        }
        System.out.println("Thank you for using TD Bank ATM!");
    }
}
