package day15_logicalops_switch_ternary;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        //check if age is NOT more than 7. print "Need to sit in child car seat"

        if (!(age > 7)) {
            System.out.println("Need to sit in child car seat. age = " + age);
        } else {
            System.out.println("Can sit in normal seat. age = " + age);
        }

        boolean isSmokingAllowed = false;

        //if smoking not allowed: print "Smoking is not allowed here. Exit."
        if (!isSmokingAllowed) {
            System.out.println("Smoking is not allowed here. Exit.");
        }

        boolean isAffordable = true;
        //if it is NOT affordable print "Item not affordable"

        if (!isAffordable) {
            System.out.println("Item not affordable");
        }

        String env = "qa";
        if (env.equals("qa")) {
            System.out.println("In wrong environment for QA testing");
        }

        String carModel = "Lexus";
        //if its not Lexus print "Not interested"
        if (!carModel.equals("Lexus")) {
            System.out.println("Not interested");
        }
        String secretPassword = "abc123";
        String inputPassword = "abc321";
        //if inputPassword IS NOT equal to secretPassword : Print incorrect password
        if(!inputPassword.equals(secretPassword)) {
            System.out.println("Incorrect password");
        }

        if(!inputPassword.equals("abc123")) {
            System.out.println("Incorrect password");
        }

        if (inputPassword.equals("abc123")) {
            System.out.println("Correct password");
        } else {
            System.out.println("Incorrect password");
        }
    }
}
