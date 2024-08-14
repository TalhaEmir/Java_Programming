package Haydenclass.Week06.Week0hocaninkiler;

import java.util.Scanner;

public class CapitalizationVoid {

    public static void main(String[] args) {

capitalize();

       // System.out.println(capitalize("Talha", "Dogan"));

    }

    public static void capitalize() {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an name: ");
        String name = input.nextLine().toLowerCase();
        System.out.print("Enter an surname: ");
        String surname = input.nextLine().toLowerCase();
        input.close();

        name = name.toUpperCase().charAt(0)+name.substring(1); ;
       surname = surname.toUpperCase().substring(0, 1)+ surname.substring(1);

        System.out.println(name+ " "+ surname);

    }

    /* static String capitalize(String firstName, String lastName) {

        firstName = firstName.toUpperCase().substring(0, 1)+ firstName.toLowerCase().substring(1);
        lastName = lastName.toUpperCase().substring(0, 1)+ lastName.toLowerCase().substring(1);
        return firstName+" "+lastName;
    }*/



}
