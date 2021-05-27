package OfficeHours;

public class PracticeMayEleventh {
    public static void main(String[] args) {
        String sentence = "The cat goes down the street";
        String[] words = sentence.split(" ");
        String reversed = "";
        for(int i = words.length-1; i >= 0; i--) {

          reversed += words[i] + " ";
        }
        System.out.println("Sentence = " + sentence);
        System.out.println("Reversed = " + reversed.trim());
    }
}
