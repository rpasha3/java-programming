package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        //location , salary , remote , benefits
        String location = "Colorado Springs";
        double salary = 120_000.0;
        boolean isRemote = true;
        boolean benefits = true;

        if (salary >= 120000 && isRemote == true && benefits == true && location.equals("Colorado Springs")) {
            System.out.println("Great work, this is your dream job!");
            System.out.println("Congratulations on your new position!");
        } else {
            System.out.println("Job requirements not met, keep searching...");
        }
    }
}
