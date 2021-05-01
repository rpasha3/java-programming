package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main(String[] args) {
        String city = "Tampa";
        if (city.equals("Tampa") || city.equals("Moscow")) {
            System.out.println("Willing to relocate to " + city);
        } else {
            System.out.println("Not considering - " + city);
        }

        String teacher = "Murodil";
        if (teacher.equals("Murodil") || teacher.equals("Saim")) {
            System.out.println("It is a java class with " + teacher);
        } else {
            System.out.println("Soft skill class with " + teacher);
        }

        if (teacher.equals("Murodil") || teacher.equals("Saim")) {
            System.out.println("It is a java class with " + teacher);
        } else if (teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        } else {
            System.out.println("Some class with " + teacher);
        }

        //company - "Google", salary >= 100_000
        String company = "Google";
        double salary = 100_000;
        if (company.equals("Google") || salary >= 100_000) {
            System.out.println("Accept offer from " + company);
        } else {
            System.out.println("Decline offer from " + company);
        }
    }
}
