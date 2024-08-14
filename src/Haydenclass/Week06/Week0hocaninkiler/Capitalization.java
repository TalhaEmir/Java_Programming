package Haydenclass.Week06.Week0hocaninkiler;

import java.util.Scanner;

public class Capitalization {

    public static void main(String[] args) {

        /*
         Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
         */
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = input.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = input.nextLine();

        System.out.println(capitalization(firstName, lastName));


    }

    private static String capitalization(String firstName, String lastName) {

        firstName = firstName.toUpperCase().substring(0, 1)+ firstName.toLowerCase().substring(1);
        lastName = lastName.toUpperCase().substring(0, 1)+ lastName.toLowerCase().substring(1);
        return firstName+" "+lastName;
    }


}
