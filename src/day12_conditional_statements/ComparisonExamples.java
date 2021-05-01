package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int currentSpeed = 4_5; //45
        int speedLimit = 5_5; //55
        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println(currentSpeed > speedLimit); //false 55 not more 55
        System.out.println(speedLimit > currentSpeed); //false 55 not less 45
        System.out.println(speedLimit == currentSpeed); //false 55 not equal 45
        System.out.println("Are you speeding? -" + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");
        //45 + 20 -> 65
        currentSpeed += 20; //65

        isSpeeding = currentSpeed > speedLimit;
        System.out.println("isSpeeding = " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");

        double accountBalance = 250.25;
        double itemPrice = 100;
        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can you afford the item? - " + canAfford);
        System.out.println("Can I afford? - " + (accountBalance >= itemPrice));

        //decrease balance by itemprice using shorthand operator

        accountBalance -= itemPrice;
        System.out.println("accountBalance = " + accountBalance);

        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? = " + isBroke);





    }
}
