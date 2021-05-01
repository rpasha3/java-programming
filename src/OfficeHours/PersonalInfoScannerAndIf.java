package OfficeHours;

import java.util.*;

public class PersonalInfoScannerAndIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people do you live with?");
        int roomMates = scan.nextInt();
        if (roomMates < 2) {
            System.out.println("Live with less than 2 people");
        } else if (roomMates >= 3 && roomMates <= 6) {
            System.out.println("Live with 3 - 6 people");
        } else if (roomMates > 6) {
            System.out.println("Live with more than 6 people");
        }

        System.out.println();
        System.out.println("What city do you live in?");
        String city = scan.next();
        System.out.println("Do you live downtown?");
        String liveInCity = scan.next();
        if (liveInCity.equals("yes") || liveInCity.equals("no")) {
            System.out.println("Have you thought about moving to the suburbs?");
            String moveToSuburbs = scan.next();
            if (moveToSuburbs.equals("yes")) {
                System.out.println("Do it, it is great!");
            } else if(moveToSuburbs.equals("no")) {
                System.out.println("You should think about it");
            }
        }
        System.out.println();
        System.out.println("What is your favorite animal?");
        String animal = scan.next();
        System.out.println("Wow, "+animal+" is a great animal!");
        System.out.println();
        System.out.println("How many pets do you want?");
        int howManyPetsWant = scan.nextInt();
        System.out.println("Interesting, would you want "+howManyPetsWant+" of "+animal+" as your pets?");
    }
}
