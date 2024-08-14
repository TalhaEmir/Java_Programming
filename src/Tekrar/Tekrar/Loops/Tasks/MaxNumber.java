package Tekrar.Tekrar.Loops.Tasks;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {


        int number = 0;

        int max=0;

        while (number <= 5) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number");
            int num = input.nextInt();
            if (num> max){
                max=num;
            }
            number++;

        }
        System.out.println(max);
    }
}
