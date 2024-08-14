package Week05.day12.task;

import java.util.Scanner;

public class frstnameandlastname {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter the first name");
        String first=input.nextLine().trim().replace(" ","");// trim gonna clean the white spaces
        // replace part replace the spaces these two method will make sure that the whitr spaces additonals
        // spaces between thr characters will be removed

        System.out.println("Enter the last name");
        String last=input.nextLine();


            first= first.substring(0,1).toUpperCase()+first.substring(1).toLowerCase();
            last = last.substring(0,1).toUpperCase()+last.substring(1).toLowerCase();
        //getting first character if first time + the remaining character of the first time


        String fullName=first+" "+last;// yo grt to full name
        System.out.println(fullName);



        /*Scanner sc = new Scanner(System.in);

        System.out.println("Ask the user enter two words");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();
System.out.println(word1.replace("cyDEo","Cydeo ")+ word2.replace("SCHOOL","School"));

          /*  String first="cyDEo";
            String last="SCHOOL";

           */



    }


}
