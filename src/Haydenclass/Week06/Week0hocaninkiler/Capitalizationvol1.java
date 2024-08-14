package Haydenclass.Week06.Week0hocaninkiler;

import java.util.Scanner;

public class Capitalizationvol1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an name: ");
        String name = input.nextLine().toLowerCase();
        System.out.print("Enter an surname: ");
        String surname = input.nextLine().toLowerCase();
        input.close();

        capitalize(name,surname);


    }
    public static void capitalize(String a,String b) {



        a = a.toUpperCase().charAt(0)+a.substring(1); ;
        b = b.toUpperCase().substring(0, 1)+ b.substring(1);

        System.out.println(a+ " "+ b);

    }
}
