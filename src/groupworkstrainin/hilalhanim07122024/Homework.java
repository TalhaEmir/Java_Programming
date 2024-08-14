package groupworkstrainin.hilalhanim07122024;

import java.util.Scanner;


public class Homework {


    public static void main(String[] args) {


        /*/*
Create a class named LongestString
			1.1 Ask the user to enter two strings
			1.2 Write a program that can print the longest string,
			if both have the same number of characters then print "Equal"
         */


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first word: ");
        String firstWord = input.nextLine();
        System.out.println("Enter a second word: ");
        String secondWord = input.nextLine();

        input.close();

        if (firstWord.length()>secondWord.length()) {
            System.out.println(firstWord+"bigger than "+secondWord);
        } else if (secondWord.length()>firstWord.length()) {
            System.out.println(secondWord+"bigger than "+firstWord);

        }else {
            System.out.println(firstWord+"equal "+secondWord);
        }











    }
}
