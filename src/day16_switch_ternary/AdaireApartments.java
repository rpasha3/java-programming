package day16_switch_ternary;

public class AdaireApartments {
    public static void main(String[] args) {
        System.out.println("***** WELCOME TO ADAIRE APARTMENTS *****");
        int numberOfBedrooms = 1;
        double startingPrice = 0;

        if (numberOfBedrooms == 0);
        switch (numberOfBedrooms) {
            case 0:
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                break;
            case 1:
                System.out.println("One bedroom apartment selected");
                startingPrice = 1725;
                break;
            case 2:
                System.out.println("Two bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println(numberOfBedrooms+ " bedroom currently unavailable.");
        }
        System.out.println("Congrats! Your new rent is $" + startingPrice);
    }
}
