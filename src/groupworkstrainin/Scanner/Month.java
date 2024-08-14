package groupworkstrainin.Scanner;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the month number: ");
        int month = input.nextInt();
        switch (month) {
            case 1:
            System.out.println("January");
            break;
            case 2:
            System.out.println("February");
            break;
            case 3:
           System.out.println("March");
           break;
           case 4:
           System.out.println("April");
           break;
           case 5:
           System.out.println("May");
           break;
            default:
                System.out.println("Invalid month");
        }

    }
}
