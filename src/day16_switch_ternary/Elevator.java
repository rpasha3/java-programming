package day16_switch_ternary;

public class Elevator {
    public static void main(String[] args) {
        int floorNum = 3;
        if (floorNum == 1) {
            System.out.println("Floor "+floorNum+" selected. Companies: Lobby, Starbucks, Verizon");
        } else if (floorNum == 2) {
            System.out.println("Floor "+floorNum+" selected. Companies: Cybertek, NASA, Intelsat");
        } else if (floorNum == 3) {
            System.out.println("Floor "+floorNum+" selected. Companies: Lyft, BofA, Steakhouse");
        } else {
            System.out.println("Invalid floor - " + floorNum);
        }

        System.out.println("==========SWITCH STATEMENT VERSION==========");

        floorNum = 1;
        switch(floorNum) {
            case 1:
                System.out.println("Floor "+floorNum+" selected. Companies: Lobby, Starbucks, Verizon");
                break; //EXIT SWITCH
            case 2:
                System.out.println("Floor "+floorNum+" selected. Companies: Cybertek, NASA, Intelsat");
                break; //EXIT SWITCH STATEMENT
            case 3:
                System.out.println("Floor "+floorNum+" selected. Companies: Lyft, BofA, Steakhouse");
                break; //EXIT SWITCH STATEMENT
            default:
                System.out.println("Invalid floor - " + floorNum);
        }




    }
}
