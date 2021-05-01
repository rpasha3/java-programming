package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "Los Angeles";
        if (city.equals("Los Angeles")) {
            System.out.println("It is LA");
        } else {
            System.out.println("It is NOT LA");
        }
        String weather = "sunny";
        if (weather.equals("sunny")) {
            System.out.println("It is nice day outside");
        } else {
            System.out.println("It is not good day outside");
        }
    }
}
