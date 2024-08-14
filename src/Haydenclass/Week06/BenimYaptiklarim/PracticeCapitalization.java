package Haydenclass.Week06.BenimYaptiklarim;

import java.util.Scanner;

public class PracticeCapitalization {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an  your name: ");
        String name = input.nextLine().toLowerCase();
        System.out.print("Enter an your surname: ");
        String surname = input.nextLine().toLowerCase();


        System.out.println( printCapitalization(name, surname));




    }

    public static String printCapitalization(String name, String surname) {
        name = name.toUpperCase().substring(0, 1) + name.substring(1);
        surname = surname.toUpperCase().substring(0, 1) + surname.substring(1);

        return name + " " + surname;

    }


        /*
         Create a method named capitalization that can format the first and last names of the person and display the full name of the person
    Ex:
        capitalization("cyDeO", "sCHooL")

        output:
            full name: Cydeo School
         */
}
