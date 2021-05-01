package day15_logicalops_switch_ternary;

public class UsedCarSelector {
    public static void main(String[] args) {
        double budget = 40_000;
        String model = "Lexus";
        double carPrice = 29_999;

        if (carPrice <= budget && (model.equals("Lexus") || model.equals("Ford") || model.equals("Toyota"))) {
            System.out.println("Ready to purchase model = " + model + " price = " + carPrice);
        } else {
            System.out.println("Not interested in model = " + model + " price = " + carPrice);
        }
    }
}
