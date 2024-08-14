package Week05.day11.lessons;

import java.util.Scanner;

public class Digitalletterspecialchar {


    public static void main(String[] args) {

        /*Create a class named DigitLetterSpecialChar and write a program that can ask the user to enter a word
	        - if the word starts with digits, print "first character is digit"
	        - if the word starts with uppercase letters, print "first character is lowercase letter"
	        - if the word starts with lowercase letters, print "first character is uppercase letter"
	        - if the word starts with special characters, print "first character is special character"


        	HINT: You need to check the ascii table

         */

       // String str= new Scanner(System.in).nextLine();
       // String str="Cydeo123"; we can do that one

     // System.out.println("".charAt(0));Emptynes of empty value

        String str= new Scanner(System.in).nextLine();// If we use Scanner just one time and we are not gonna use we can do that one

        if (str.length()>=1){

            char f=str.charAt(0);// the first character of String

            if (f>'0' && f<='9'){
                System.out.println("First Character is digit");
            }else if (f>'A' && f<='Z'){
                System.out.println("First Character is uppercase letter");
            }else if (f>'a' && f<='z'){
                System.out.println("First Character is uppercase letter");
            }else{
                System.out.println("First Character is special character");
            }

        }else { // if string is empty
            System.out.println("string is empty");
        }




    }

}
