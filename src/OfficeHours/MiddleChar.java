package OfficeHours;

public class MiddleChar {
    public static void main(String[] args) {
        /*
         * odd:
         *
         * apple
         * 01234
         * p -> 2   5/2 -> 2
         *
         *
         * dog
         * 012
         *0 -> 1    3/2 -> 1
         *
         * even         4/2 = 2
         * 0123
         *
         */

        String word = "even";

        if(word.length() % 2 == 1){
            //odd
            System.out.println(word.charAt(word.length()/2));
            System.out.println(word.substring(word.length()/2, word.length()/2+1));

        }else{
            //even
            int index = word.length()/2;
            System.out.println(word.charAt(index-1) +""+ word.charAt(index));
            System.out.println(word.substring(index-1, index+1));
        }
    }
}
