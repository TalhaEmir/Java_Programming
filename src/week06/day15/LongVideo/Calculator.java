package week06.day15.LongVideo;

import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String answer = "yes";


        while (answer.equals("yes")) {
            System.out.println("Enter your first number:");
            double num1 = input.nextDouble();

            System.out.println("Enter the math operator");
            char o = input.next().charAt(0);


            while (!(o == '+' || o == '-' || o == '*' || o == '/')) {
                System.out.println("It is an invalid operator. Please re-enter again:");
                o = input.next().charAt(0);
            }


            System.out.println("Enter your second number:");
            double num2 = input.nextDouble();


            double result = (o == '+') ? num1 + num2 : (o == '-') ? (num1 - num2) : (o == '*') ? num1 * num2 : (num1 / num2);
            System.out.println("result " + result);

            System.out.println("Would you like to continue ? Yes/no");
            answer = input.nextLine();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("Invalid Answer! Would you like to continue?Yes/no");
                answer = input.next().toLowerCase();

            }


        }


    }

}
