package day46_encapsulation;

public class Dealership {
    public static void main(String[] args) {
        Car car1 = new Car();
        //ERROR below, model and year are PRIVATE and cannot be accessed from a different class
        //car1.model = "Toyota Supra";
        //car1.year = "1994";
        car1.setModel("Toyota Supra");
        System.out.println("car1 model = " + car1.getModel());

        car1.setYear(1994);
        System.out.println("car1 year = " + car1.getYear());

        car1.setMileage(49000);
        System.out.println("car1 mileage = " + car1.getMileage());

        System.out.println(car1.toString());
        System.out.println(car1); //automatically calls toString method

        Car lexus = new Car();
        lexus.setModel("Lexus RCF");
        lexus.setYear(2018);
        lexus.setMileage(10000);

        System.out.println("Model = " + lexus.getModel());
        System.out.println("Year = " + lexus.getYear());
        System.out.println("Mileage = " + lexus.getMileage());
        System.out.println(lexus);
    }
}
