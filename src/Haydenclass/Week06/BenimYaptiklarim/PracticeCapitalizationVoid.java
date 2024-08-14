package Haydenclass.Week06.BenimYaptiklarim;

import java.util.Scanner;

public class PracticeCapitalizationVoid {


    public static void main(String[] args) {

       capitalize();
    }

    public static void capitalize() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = input.nextLine().toLowerCase();
        System.out.print("Enter a surname: ");
        String surname = input.nextLine().toLowerCase();
        input.close();

        name = surname.substring(0, 1).toUpperCase() + surname.substring(1);
        surname = name.substring(0, 1).toUpperCase() + name.substring(1);


        System.out.println(name + surname);
    }


    public static void capitalize2() {
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
    }

