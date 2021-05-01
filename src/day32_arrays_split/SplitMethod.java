package day32_arrays_split;


import java.util.*;

public class SplitMethod {
    public static void main(String[] args) {
        String words = "java:python:selenium:html";
        String[] wordsArray = words.split(":");
        System.out.println(Arrays.toString(wordsArray));
        System.out.println("length of array = " + wordsArray.length);

        for(String each : wordsArray) {
            System.out.println(each);
        }

        String sentence = "today I am coding java arrays";
        String[] wordsInSentence = sentence.split(" ");
        System.out.println(Arrays.toString(wordsInSentence));
        System.out.println("Number of words in sentence = " + wordsInSentence.length);

        for(String each : wordsInSentence) {
            System.out.println(each);
        }
    }
}
