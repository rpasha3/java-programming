package day19_class_vs_object_strings;

public class StringStartsEndsWith {
    public static void main(String[] args) {
        String word = "intellij idea";
        System.out.println(word.startsWith("i")); //true
        System.out.println(word.startsWith("in"));
        System.out.println(word.startsWith("intellij"));
        System.out.println(word.startsWith("intellij idea"));
        System.out.println("java".startsWith("j"));

        System.out.println(word.startsWith("Int")); //false. case sensitive

        System.out.println(word.endsWith("idea")); //true
        System.out.println(word.endsWith("a"));

        String name = "Irina";
        if(name.endsWith("a")) {
            System.out.println("Maybe it is a female name");
        }

        String firstName = "Dr. Nadir";
        if(firstName.startsWith("Dr")) {
            System.out.println("Doctor");
        }else if(firstName.startsWith("Mr")) {
            System.out.println("Man");
        }else if(firstName.startsWith("Mrs")) {
            System.out.println("Married Woman");
        }else if(firstName.startsWith("Ms")) {
            System.out.println("Single Woman");
        }else if(firstName.startsWith("Sr")) {
            System.out.println("Senior");
        }else{
            System.out.println("Normal name");
        }

        /**
         * String url = "https://stackoverflow.com"
         * .com -> "Commercial website"
         * .ru -> "Russian website"
         * .gov -> "Government website"
         * .edu -> "Education/University website"
         * .org -> "Organization website"
         */

        String url = "https://stackoverflow.com";
        if(url.endsWith(".com")) {
            System.out.println("Commercial Website");
        }else if(url.endsWith(".ru")) {
            System.out.println("Russian Website");
        }else if(url.endsWith(".gov")) {
            System.out.println("Government Website");
        }else if(url.endsWith(".edu")) {
            System.out.println("Educational Website");
        }else if(url.endsWith(".org")) {
            System.out.println("Organization Website");
        }else{
            System.out.println("Invalid Website");
        }
    }
}
