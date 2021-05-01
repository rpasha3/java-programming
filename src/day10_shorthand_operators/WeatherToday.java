package day10_shorthand_operators;

import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        System.out.println("How is the weather today? ");
        Scanner scan = new Scanner(System.in);
      //  String weather = scan.next();
        String weather = scan.nextLine();
        System.out.println(weather + " , it is a nice day today!");
    }
}
