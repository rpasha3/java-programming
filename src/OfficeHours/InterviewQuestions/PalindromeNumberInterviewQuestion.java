package OfficeHours.InterviewQuestions;

public class PalindromeNumberInterviewQuestion {
    public static void main(String[] args) {
        System.out.println(112 % 1);
        System.out.println(112 % 10);
        System.out.println(112 % 100);

        System.out.println(isPalindrome(1234321));

    }

    public static boolean isPalindrome(int number){
        int reverse = 0; //0
        int tempNum = number; //1234

        while (tempNum != 0) {

            int lastDigit = tempNum % 10; //1
            reverse = (reverse * 10) + lastDigit;
            tempNum /= 10;
            System.out.println(reverse);

        }
        return reverse == number;
    }

}
