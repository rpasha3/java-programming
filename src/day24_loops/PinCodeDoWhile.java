package day24_loops;

import java.util.*;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPincode = 7228;
        int pincode = scan.nextInt();
        do{
            System.out.println("Enter PinCode: ");
            pincode = scan.nextInt();
        }while(pincode != secretPincode); {
            System.out.println("Welcome to your account.");
        }
    }
}
