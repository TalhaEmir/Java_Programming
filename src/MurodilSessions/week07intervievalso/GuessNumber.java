package MurodilSessions.week07intervievalso;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);

        //int secretNumber= 22;
        int secretNumber = new Random().nextInt(100) ;
        int guessNumber= 0;
        int tries=0;


        do {
            System.out.println("Guess the number");
            guessNumber = input.nextInt();
            tries++;
            if (guessNumber > secretNumber) {
                System.out.println("Your number is greater than the secret number");
            } else if (guessNumber<secretNumber) {
                System.out.println("Your number is less than the secret number");

            }else {
                System.out.println("Your number is correct");
            }

            if (tries >= 5 && guessNumber != secretNumber) {
                System.out.println("You lost" + secretNumber);
                break; // Oyun sona erer
            }

        }while (guessNumber != secretNumber);

        System.out.println("Game over");


    }
}
