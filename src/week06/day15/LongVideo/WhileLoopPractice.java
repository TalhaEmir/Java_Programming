package week06.day15.LongVideo;

import java.util.Scanner;

public class WhileLoopPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = input.nextInt();


        while( !(age>=1 && age<=150)){ // while the age is invalid
            System.out.println("Invalid Entry ! Enter your age: ");
            age = input.nextInt();
        }

        if (age >= 21) {
            System.out.println("Eligible");
        }else {
            System.out.println("Not Eligible");
        }

        input.close();

    }
}
