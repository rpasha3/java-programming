package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "Tall";
        double price = 0.0;
        int calories = 0;

        if (size.equals("Tall"));
        switch(size) {
            case "Tall":
                price = 3.69;
                calories = 90;
                System.out.println("Tall Cappuccino please");
                break;
            case "Grande":
                price = 3.99;
                calories = 120;
                System.out.println("Grande Cappuccino please");
                break;
            case "Venti":
                price = 4.29;
                calories = 150;
                System.out.println("Venti Cappuccino please");
                break;
            default:
                System.out.println("We do not serve that size of Cappuccino");
        }

        System.out.println("Total price: $"+price);
        System.out.println("Total calories consumed: "+calories);
    }
}
