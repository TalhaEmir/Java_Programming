package Tekrar.Days.DAY15_GENEL.Day15;

import java.util.Scanner;

public class CydeoLogin {


    public static void main(String[] args) {

        String u = "Cydeo";
        String p = "WoodenSpoon";

       loggedIn("ada","adwad");


    }


    public static void loggedIn(String username, String password) {
        Scanner input = new Scanner(System.in);
        if (username.equals("cydeo") && password.equals("cydeo")) {
            System.out.println("Logged in");
        } else {// otherwise
            for (int i = 0; i < 3; i++) {// i=0,1,2

                if (i != 2) {
                    System.err.println("Incorrect username or password");
                } else {
                    System.out.print("This is your last attempt, Please re-enter your username and password");
                }

                System.out.print("Enter your username: ");
                username = input.nextLine();

                System.out.print("Enter your password: ");
                password = input.nextLine();

                if (username.equals("Cydeo") && password.equals("WoodenSpoon")) { //if the user enters valid credentials
                    System.out.println("You are now logged in");
                    break; // exits the loop
                }
                if (!(username.equals("Cydeo") && password.equals("Wooden Spoon"))) {// after threee attempts, if the username and passwword still incorrect
                    System.out.println("Your  account now is locked, please contact with the support team !");
                }

                input.close();


            }


        }


    }

}



