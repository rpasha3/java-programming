package day20_string_manipulation;

public class StringContains {
    public static void main(String[] args) {
        String company = "Capital one";
        System.out.println(company.contains("i")); //true
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("l o")); //true
        System.out.println(company.contains("j")); // false
        System.out.println(company.contains("One")); //true

        //if company contains space, print "company name with multiple words"
        if(company.contains(" ")) {
            System.out.println("Multi word company name");
        }else{
            System.out.println("Single word company name");
        }

        String etsyTitle = "Wooden spoon | Etsy";
        //check if " | " is in etsyTitle
        if(etsyTitle.contains(" | ")) {
            System.out.println("Pass = title check passed");
        }else{
            System.out.println("Fail - title check failed");
        }

        String firstName = "ahmed";
        //check if firstName contains "a" and "e" at the SAME TIME
        if(firstName.contains("a") && firstName.contains("e")) {
            System.out.println("Pass - name contains a and e at same time");
        }else{
            System.out.println("Fail - name does not contain a and e at same time");
        }

        firstName = "Nadir";
        if(firstName.contains("a") || firstName.contains("i")) {
            System.out.println("a or i is present");
        }else{
            System.out.println("nor a or i is present");
        }

        String email = "rpasha3@hotmail.com";
        //check if email contains "@" and ends with ".com"

        if(email.contains("@") && email.endsWith(".com")) {
            System.out.println("Valid email address");
        }else{
            System.out.println("Invalid email address");
        }
        //CASE insensitive contains
        if(email.toLowerCase().contains("d")) {
            System.out.println("d is present");
        }else{
            System.out.println("d is not present");
        }
    }
}
