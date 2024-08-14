package week06.day15.LongVideo;

import java.util.Scanner;

public class MinimumNumbers {

    public static void main(String[] args) {


/*
1. Write a program that can ask the user to enter a number for 5 times
and returns the maximum number
 */

            int min = 2147433648;// 10 , 5 , 3,20,15
            Scanner input = new Scanner(System.in);

            //fori ( type it short way)

            for (int i = 0; i < 2; i++) { // loop for five times, 0,1,2,3,4
                System.out.println("Enter number: ");// it is gonna print 5 times 20,30,-5,10,100,200
                int number = input.nextInt();

                if (number < min) {
                    min = number; // -10,5,3,20,15
                }
            }
            System.out.println("min =" + min);

input.close();
        }
    }
