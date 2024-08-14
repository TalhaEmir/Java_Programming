package week06.day15.LongVideo;

import java.util.Scanner;

public class Operator {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your   number: ");
        double num1= input.nextDouble();

        System.out.println("Enter your second number");
        double num2= input.nextDouble();

        System.out.println("Enter a math operator");
        char operator= input.next().charAt(0);

        while (! (operator=='+'||operator=='-'||operator=='*'||operator=='/')) {
            System.err.println("Invalid Operator! Please re-enter the math operator");
            operator= input.next().charAt(0);
        }// while the operator is invalid







    }
}
