package day06_arithmetic_operators;

public class CarDriverInfo {
    public static void main(String[] args) {
        String carModel = "Ford Mustang";
        String driverName = "Raif";
        String licenseNum = "B8B7465";
        short speed = 185;
        boolean isAutomatic = false;
        char licenseClass = 'C';

        System.out.println("Car Model     : "+carModel);
        System.out.println(carModel + " is the car model.");
        System.out.println("Driver Name   : "+driverName);
        System.out.println("License Num   : "+licenseNum);
        System.out.println("Top Speed     : "+speed);
        System.out.println("Is auto?      : "+isAutomatic);
        System.out.println("License class : "+licenseClass);
        System.out.println("Current speed : " + speed + " mph");
// single line print test
        System.out.println("Car model is: \t\t" +carModel+"\n" + "Driver Name is: \t" + driverName+ "\n" +
                "License Number is: \t" +licenseNum+ "\n" + "Top Speed is:\t\t"+ speed+"\n"+ "Is automatic?\t\t" +
                isAutomatic + "\n" + "License Class is:\t"+ licenseClass);

      //  System.out.println(licenseClass + isAutomatic); // will not work
         System.out.println(licenseClass + "" + isAutomatic); // will work


    }
}
