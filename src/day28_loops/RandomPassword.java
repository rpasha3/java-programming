package day28_loops;

import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHILJKLMONQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%&_-";
        Random random = new Random();
        String password = "";

        for(int i = 1; i <= 8; i++) {
            int index = random.nextInt(source.length()); //random num 0-70
            password += (source.charAt(index));
            //System.out.println(random.nextInt(source.length()));
        }

        System.out.println("Your password = " + password);
    }
}
