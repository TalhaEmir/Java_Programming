package Bestexamples.groupworkstrainin.Scanner;

import java.util.Scanner;

public class Alcohol1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an your age: ");
        int num = input.nextInt();

        if (num >= 18) {
            System.out.println("You are eligible for buy alcohol");
        }else if (num < 18) {
            System.out.println("You are not eligible for buy alcohol");
        }



    }
}
