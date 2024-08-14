package week06.day15.day15tasks;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int max = -214324325;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number: ");
            int number = input.nextInt();
            if (number > max) {
                max = number;


            }
            System.out.println(max);
        }
    }

}

