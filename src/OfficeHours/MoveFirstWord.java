package OfficeHours;
 /*
        MOVE FIRST WORD
        given a sentence, display the sentence with the first word moved to the end of the sentence.
        input: java is a fun language
        output: is a fun language java
        hint: use indexOf and substring
         */

public class MoveFirstWord {
    public static void main(String[] args) {

        String str = "Java is a fun language";
        int space = str.indexOf(" ");
        String firstWord = str.substring(0, space);
        System.out.println(str.substring(space+1) + " " + firstWord);
    }
}
