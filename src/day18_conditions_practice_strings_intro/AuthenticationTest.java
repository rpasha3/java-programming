package day18_conditions_practice_strings_intro;

public class AuthenticationTest {
    public static void main(String[] args) {
        int expLast4SSN = 7228;
        int expPinCode = 9916;

        int last4SSN = 7288;
        int pinCode = 9916;

        if(last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication Successful.");
        }else{
            System.out.println("Authentication Unsuccessful. Please try again.");
            if(last4SSN != expLast4SSN) {
                System.out.println("Last 4 SSN number is incorrect.");
            }
            if(expPinCode != pinCode) {
                System.out.println("Incorrect Pin number.");
            }
        }
    }
}
