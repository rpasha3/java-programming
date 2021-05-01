package day07_arithmetic_operators_casting;

public class Apartment {
    public static void main(String[] args) {
        String address = "22671 Lamoreax Landing Cir";
        String owner = "Raif Pasha";
        int numberOfUnits = 10;
        String avgSizeOfApt = "1500 sqft";
        int monthlyRent = 2000; //$
        String numOfWasherAndDriers = "1 per apartment";
        boolean allowsPets = true;
        boolean hasPool = true;
        int lengthOfLease = 12; //months
        int totalNumOfResidents = 20;
        float phoneNumOfOwner = 7036787228F;
        boolean isNearGasStation = true;
        int numOfFloors = 5;
        boolean hasBasement = false;
        boolean hasUnitsAvail = false;
        boolean hasAirConditioning = true;
        int numOfParkingSpaces = 60;
        boolean hasWheelchairAccess = true;
        String numOfReviewStars = "4.9 out of 5";

        double monthlyRentAfter3Years = monthlyRent * .90;
        double monthlyRentAfter6Years = monthlyRent * .80;
        double averageNumOfResidentsPerUnit = totalNumOfResidents / numberOfUnits;
        double averageNumOfParkingSpots = numOfParkingSpaces / numberOfUnits;
        double averageNumOfUnitsPerFloor = numberOfUnits / numOfFloors;

        System.out.println("Monthly Rent After 3 Years = " + monthlyRentAfter3Years);
        System.out.println("Monthly Rent After 6 Years = " + monthlyRentAfter6Years);
        System.out.println("Average Num Of Residents Per Unit = " + averageNumOfResidentsPerUnit);
        System.out.println("Average Num Of Parking Spots = " + averageNumOfParkingSpots);
        System.out.println("Average Num Of Units Per Floor = " + averageNumOfUnitsPerFloor);



    }
}
