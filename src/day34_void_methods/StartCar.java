package day34_void_methods;

public class StartCar {
    public static void main(String[] args) {
        seatInCar();
        startTheCar();
        shiftToDrive();
        pressGasPedal();

    }
    public static void pressGasPedal() {
        System.out.println("4. Press down on the gas pedal to move forward");
    }
    public static void seatInCar() {
        System.out.println("1. Open the door and sit in the driver seat");
    }
    public static void startTheCar() {
        System.out.println("2. Insert key to ignition and turn clockwise");
    }
    public static void shiftToDrive() {
        System.out.println("3. Shift transmission to drive position");
    }
}
