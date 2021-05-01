package day09_scanner_practice;
import java.util.Scanner;

public class RentCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter monthly rent: ");
        double monthlyRent = scan.nextInt();
        double monthlyDays = 30;
        double weeklyRent = monthlyRent / 4;
        double dailyRent = monthlyRent / monthlyDays;
        double hourlyRent = dailyRent / 24;
        double rentPerMinute = hourlyRent / 60;
        double yearlyRent = monthlyRent * 12;
        System.out.println("============================");
        System.out.println("Weekly rent: $" + weeklyRent);
        System.out.println("Daily rent: $" + dailyRent);
        System.out.println("Hourly rent: $" + hourlyRent);
        System.out.println("Rent paid per minute: $" + rentPerMinute);
        System.out.println("Rent paid in year: $" + yearlyRent);
    }
}
