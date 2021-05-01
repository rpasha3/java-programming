package day18_conditions_practice_strings_intro;
/*
-> "FizzBuzz" if number is divisible by 3 and 5
-> "Fizz" if number is divisible by 3
-> "Buzz" if number is divisible by 5
-> otherwise print number
 */
public class FizzBuzz {
    public static void main(String[] args) {
        int num = 15;
        if(num % 3 == 0 && num % 5 == 0) {
            System.out.println("FizzBuzz");
        } else if (num % 3 == 0 ) {
            System.out.println("Fizz");
        } else if ( num % 5 == 0) {
            System.out.println("Buzz");
        } else {
            System.out.println(num);
        }
    }
}
