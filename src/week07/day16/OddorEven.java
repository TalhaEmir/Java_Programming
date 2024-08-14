package week07.day16;

import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);




        while (true) {
            System.out.println("Enter a number");
            int number = input.nextInt();


            if (number % 2 == 0) {
                System.out.println("even number");
            } else {
                System.out.println("odd number");
            }

            System.out.println("Would you like to enter another number? (Yes/No)");
            String answer = input.next().toLowerCase();


            while(!(answer.equals("Yes") || answer.equals("No"))) {
                System.out.print("Invalid Entry, Would you like to enter another number");
                answer = input.next().toLowerCase();



            }

            if (answer.equals("No")) {
                break;
            }

            }

        }


    }





