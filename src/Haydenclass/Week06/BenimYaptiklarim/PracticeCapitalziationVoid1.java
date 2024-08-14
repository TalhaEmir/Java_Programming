package Haydenclass.Week06.BenimYaptiklarim;

import java.util.Scanner;

public class PracticeCapitalziationVoid1 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = input.nextLine();
        System.out.println("Enter a surname");
        String surname = input.nextLine();
        input.close();

        capitalize(name, surname);



    }

    public static void capitalize(String a, String b) {

        a=a.toUpperCase().charAt(0)+ a.substring(1).toLowerCase();
        b=b.toUpperCase().charAt(0)+ b.substring(1).toLowerCase();

        System.out.println(a+ " "+ b);



    }



}
