package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(720);
        checkEligible(400);
        checkEligible(808);
        System.out.println(getCreditScore());
        System.out.println("Score = " + getCreditScore());
        int score = getCreditScore();
        System.out.println("Score = " + score);
    }


    public static void checkEligible(int creditScore) {
        if(creditScore >= 700) {
            System.out.println("You are eligible to lease this car!");
        } else {
            System.out.println("Sorry, you are not eligible to lease this car.");
        }
    }

    public static int getCreditScore() {
        return 800;
    }
}
