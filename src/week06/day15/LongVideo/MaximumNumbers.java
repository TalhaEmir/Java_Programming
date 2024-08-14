package week06.day15.LongVideo;

import java.util.Scanner;

public class MaximumNumbers {

    public static void main(String[] args) {

/*
1. Write a program that can ask the user to enter a number for 5 times
and returns the maximum number
 */

        int max=-2147483464;// 10 , 5 , 3,20,15
            Scanner input = new Scanner(System.in);

            for(int i=0; i<5; i++){ // loop for five times
                System.out.println("Enter number: ");// it is gonna print 5 times
                int number = input.nextInt();

                if(number>max){// if the user entered entry is greater than the current maximum number that we have
                    max = number; // /-25, 35, 15, 40,0// then user entered number should be the maximum number
                }
            }
            System.out.println("max =" + max);


        input.close();

    }
}
