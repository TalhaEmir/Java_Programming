package week06.day15.LongVideo;

import java.util.Scanner;

public class WhileLoopDemo {

    public static void main(String[] args) {

        //write a program that can repeatedly ask the user to enter a number until user a negative number

        Scanner input = new Scanner(System.in);


        /*int num=0;

        while(5>=num){ // repeated if statement
            System.out.println("Enter a number: ");
            num = input.nextInt();
            num++;
*/

            int number=5;


            while(number>=0){
                System.out.println("Enter a good number: ");
                number = input.nextInt();

            }


        }
    }

