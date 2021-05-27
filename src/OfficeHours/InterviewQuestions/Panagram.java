package OfficeHours.InterviewQuestions;

import  java.util.*;

public class Panagram {
    public static void main(String[] args) {
        String s = "A quick brown fox jumps over the lazy dog";
//        char[] a = s.replace("", "").toLowerCase().toCharArray();
//        Arrays.sort(a);
//        System.out.println(Arrays.toString(a));
        isPanagram("");
    }

    public static boolean isPanagram(String str) {
        str = str.toLowerCase();
        String alp = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < str.length(); i++) {

            if(Character.isLetter(str.charAt(i))) {

            }
        }

        return alp.isEmpty();
    }
}
