package day28_loops;

/**
 * given a string, retrieve and print only unique characters
 */

public class FindUniqueChars {
    public static void main(String[] args) {
        String word = "jaavva";
        String unique = "";

        for (int i = 0; i < word.length(); i++) {
            unique.contains(word.charAt(i) + "");
            if (!unique.contains(word.charAt(i)+"")) {
                unique += word.charAt(i);
            }
        }
        System.out.println(unique);
    }
}
