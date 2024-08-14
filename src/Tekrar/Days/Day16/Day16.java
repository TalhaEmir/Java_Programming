package Tekrar.Days.Day16;

import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String u = input.nextLine();
        System.out.print("Enter your password: ");
        String p = input.nextLine();


        if (u.equals("Cydeo") && p.equals("Wooden Spoon")) { // if the credentials are correct
            System.out.println("You are logged in!");
        } else {
            for (int i = 0; i < 3; i++) { // 0,1,2
                if(i!=2){
                System.err.println("Incorrect username or password");
            }else {
                System.out.print("This is your last attempt, Please re-enter your username and password");
            }

                System.out.print("Enter your username: ");
                u = input.nextLine();

                System.out.print("Enter your password: ");
                p = input.nextLine();

                if (u.equals("Cydeo") && p.equals("WoodenSpoon")) { //if the user enters valid credentials
                    System.out.println("You are now logged in");
                    break; // exits the loop

                }
                if (!(u.equals("Cydeo") && p.equals("Wooden Spoon"))) {// after threee attempts, if the username and passwword still incorrect
                    System.out.println("Your  account now is locked, please contact with the support team !");
                }

                input.close();

            }
        }


    }


}