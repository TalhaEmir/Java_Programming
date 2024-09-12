package Tekrar.Tekrar.Days.Day19Tekrar;

import java.util.Scanner;

public class AverageNumber2 {
    public static void main(String[] args) {
 /*/*. AverageNumber:
	            1. Ask the user how many numbers they want to enter
	            2. get all the inputs from the user and store them into an array
	            3. Iterate the array & return the average number*/

        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers  do you want to enter number: ");
        int total = input.nextInt();
        int sum = 0;
        int[] numbers=new int [total];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number ");
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

    }
}
