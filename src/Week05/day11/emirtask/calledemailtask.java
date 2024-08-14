package Week05.day11.emirtask;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class calledemailtask {

    public static void main(String[] args) {


    /*Create a class calledEmailTask1.
   Assume that email address is constructed by person's first name and followed by an underscore and last name.

    Write a program that can swap first name with last name in the email (Separated by an underscore).
    If the email doesn't contain an underscore print the given input email.

        Ex:
            input: mike_tyson@gmail.com
            output: tyson_mike@gmail.com
    */


    Scanner input = new Scanner(System.in);

        System.out.println("Put your email");
        String email = input.nextLine();

        String firstName=email.substring(0,email.indexOf("_"));
        String lastName=email.substring(email.indexOf("_")+1, email.indexOf('@'));
        System.out.println(firstName+" "+lastName);

}
}