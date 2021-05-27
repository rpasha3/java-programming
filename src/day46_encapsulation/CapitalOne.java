package day46_encapsulation;

public class CapitalOne {
    public static void main(String[] args) {
        CheckingAccount acc = new CheckingAccount();
        acc.setAccountNumber(43115432413L);
        acc.setBalance(250000);
        acc.setAccountHolder("Raif Pasha");
        acc.setAccountType("360 Checking");

        System.out.println("acc = " + acc);
    }
}
