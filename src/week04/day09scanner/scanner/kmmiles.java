package week04.day09scanner.scanner;

import java.util.Scanner;

public class kmmiles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an miles: ");
        double miles = input.nextDouble();

        input.close();

        double km=miles*1.60934;

        System.out.println(miles+" miles is "+km+" km");
    }
}
