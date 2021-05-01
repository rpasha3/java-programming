package day09_scanner_practice;
import java.util.Scanner; //import scanner class

public class AddNumbers {
    public static void main(String[] args) {
        //create scanner object
        Scanner scan = new Scanner(System.in);
        //ask question
        System.out.print("Enter a number: ");
        int num1 = scan.nextInt();
        System.out.print("Enter a second number: ");
        int num2 = scan.nextInt();
        System.out.println("The total is: " + (num1 + num2));

    }
}
