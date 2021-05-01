package day40b_ReviewClass;

import java.util.*;

public class MergeStrings2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Strings to merge: ");
        String input1 = scan.next();
        String input2 = scan.next();
        System.out.println(mergeStrings(input1, input2));
    }

    public static String mergeStrings(String one, String two) {
        String merged = "";
        String shorter = "";
        if (one.length() >= two.length()) {
            shorter = two;
        } else {
            shorter = one;
        }
        for (int i = 0; i < shorter.length(); i++) {
            merged += one.charAt(i) + "" + two.charAt(i);
        }
        if (one.length() > two.length()) {
            merged += one.substring(two.length());
        } else if (two.length() > one.length()) {
            merged += two.substring(one.length());
        }
        return merged;
    }
}




