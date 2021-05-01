package OfficeHours;

import java.util.*;

public class StringPractice2 {
    public static void main(String[] args) {
        String word1 = "apple";
        String word2 = "banana";
        System.out.println(word1.replaceFirst("a", "")); //use substring for reuseable code
        System.out.println(word2.substring(0, word2.length()-1));

        Scanner scan = new Scanner(System.in);

        String word3 = "odd";
        if(word3.length()%2==1) {
            System.out.println(word3.charAt(word3.length()/2));
            System.out.println(word3.substring(word3.length()/2, word3.length()/2+1));

        }else{
            int index = word3.length()/2;
            System.out.println(word3.charAt(index-1) + "" + word3.charAt(index));
            System.out.println(word3.substring(index-1, index+1));



        }

        String name = "Raif Pasha";

        System.out.println("Your initials are: "+name.charAt(0)+name.charAt(5));







    }
}
