package Tekrar.Tekrar.Days.Day16;

import java.util.Scanner;

public class Attempt {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int attempt=3;
        String u,p;
        do {
            System.out.println("Enter your username: ");
            u=input.nextLine();
            System.out.println("Enter your password: ");
            p=input.nextLine();
            attempt--;

            if (attempt==0) {
                break;
            }
        }while ( !(u.equals("Cydeo")&& p.equals("WoodenSpoon")) );  // while the credentials are invalid

        System.out.println("Credentials are invalid");


    }
}





