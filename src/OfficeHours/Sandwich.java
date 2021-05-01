package OfficeHours;

 /*
        a sandwich is 2 pieces of bread with something in between. print the string that is between the first
        and last appearance of bread in the given string, or return string nothing if there are not 2 piece of bread
        input: breadjambread
        output: jam
         */

public class Sandwich {
    public static void main(String[] args) {

        String sandwich = "breadjambread"; // 0 + 5 = 5 -> substring(5)

        if(sandwich.contains("bread")) {

            int firstBread = sandwich.indexOf("bread");

            if(sandwich.substring(firstBread+5).contains("bread")) { //jambread\

                int secondBread = sandwich.lastIndexOf("bread");
                System.out.println(sandwich.substring(firstBread + 5, secondBread));

            }else{
                System.out.println("1 bread");
            }

        } else {
            System.out.println("nothing");
        }

    }
}
