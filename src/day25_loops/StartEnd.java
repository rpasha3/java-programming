package day25_loops;

import java.util.*;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number");
        int start = scan.nextInt();
        System.out.println("Enter second number");
        int end = scan.nextInt();

            if(start > end) {
                System.out.println("Reverse numbering not supported");
            }else{
                for(int i = start; i <= end; i++){
                System.out.print(i + " ");
                }
            }
    }
}

