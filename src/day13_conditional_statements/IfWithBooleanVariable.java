package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
        if (isHungry == true) {
            System.out.println("I am hungry I will go get something to eat\nthen code java");
        } else {
            System.out.println("I am not hungry, lets keep coding java");
        }
        double price = 130.44;
        boolean isAffordable = price <= 200; //200 is budget

        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) {
            System.out.println("I can afford it, lets buy!");
        } else {
            System.out.println("Too expensive, lets keep coding java");
        }

        boolean isRemoteJob = true;
        //if it is NOT remoteJob print "Sorry I am not interested"
        if (isRemoteJob != true) {
            System.out.println("Sorry I am not interested");
        } else {
            System.out.println("Sure I am interested, what is the interview process?");
        }
    }
}
