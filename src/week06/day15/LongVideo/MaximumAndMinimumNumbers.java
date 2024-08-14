package week06.day15.LongVideo;

import java.util.Scanner;

public class MaximumAndMinimumNumbers {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int max= -214438364;
        int min= 214438364;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter number: ");// it is gonna print 5 times
            int number = input.nextInt();
            if(number>max){// if the user entered entry is greater than the current maximum number that we have
                max = number; // /-25, 35, 15, 40,0// then user entered number should be the maximum number
            }

            if(number<min){
                min = number;
            }

        }

        System.out.println("Maximum: "+max);
        System.out.println("Minimum: "+min);


        }



    }

