package Week05.day11.tasks;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
       /* Create a class named LogIn
        2.1 Ask the user to enter the username & password
        2.2 print "You are now logged in" If user entered valid username and password
        otherwise print the error message "Incorrect username or password. Please try again"

        Note: Assume that the valid credentials are:
        username: Cydeo
        password: WoodenSpoon

        */

        String correctUserName="Cydeo",// literal
               correctPassword="Wooden Spoon";// literal
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your username: ");
        String userName = input.nextLine();// new

        System.out.println("Enter your password: ");
        String password = input.nextLine();// new

        input.close(); // if we dont need anymore of String






        if (userName.equals(correctUserName) && password.equals(correctPassword)) {
            System.out.println("You are logged in!");
        }else {
            System.out.println("Incorrect username or password!");
        }






    }
}
