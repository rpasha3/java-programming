package OfficeHours;

public class Practice2MayEleventh {
    public static void main(String[] args) {
        String sentence = "the cow goes moo";
        String[] words = sentence.split(" ");
        String reversed = "";
        for(int i = words.length-1; i >= 0; i--) {
            reversed += words[i] + " ";
        }
        System.out.println("Sentence = " + sentence);
        System.out.println("Reversed = " + reversed.trim());
    }
}
