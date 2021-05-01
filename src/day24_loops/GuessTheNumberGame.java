package day24_loops;

import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        Scanner scan = new Scanner(System.in);
        int secretNumber = randomNumber.nextInt(101);
        int guessedNumber = 0;

        do{
            System.out.println("Guess the secret number: ");
            guessedNumber = scan.nextInt();
            if(guessedNumber > secretNumber) {
                System.out.println("wrong, your number is too large");
            }else if(guessedNumber < secretNumber){
                System.out.println("wrong, your number is too small");
            }
        }while(secretNumber != guessedNumber); {
            System.out.println("Congratulations! You have won the game! Number = " + secretNumber);
        }
    }
}
