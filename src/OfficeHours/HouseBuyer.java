package OfficeHours;

public class HouseBuyer {
    public static void main(String[] args) {
        String name = "Hills";
        double averagePrice = 0.0;
        double rating = 0.0;
        boolean gated;
        boolean allowPets;

        switch (name){
            case "Hills":
                averagePrice = 89_000;
                rating = 4.0;
                gated = false;
                allowPets = true;
                break;
            case "Oak":
                averagePrice = 75_000;
                rating = 3.5;
                gated = false;
                allowPets = true;
                break;
            case "Highland" :
                averagePrice = 150_000;
                rating = 4.5;
                gated = true;
                allowPets = false;
                break;
            case "Canyon":
                averagePrice = 201_000;
                rating = 4.8;
                gated = true;
                allowPets = true;
                break;
            default:
                name = "INVALID NAME";
                averagePrice = 0;
                rating = 0;
                gated = false;
                allowPets = false;
        }

        System.out.println("name = " + name);
        System.out.println("averagePrice = " + averagePrice);
        System.out.println("rating = " + rating);
        System.out.println("gated = " + gated);
        System.out.println("allowPets = " + allowPets);
    }
}
