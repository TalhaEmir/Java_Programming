package groupworkstrainin.today;

import java.util.Scanner;

public class applebanama {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String word = input.nextLine();
        System.out.print("Enter the second word: ");
        String word2 = input.nextLine();
        String result="";

        input.close();

        if (word.charAt(word.length()-1) == word2.charAt(0)) {
            result=word+word2.substring(1);


        }

        /*String output= word.substring(1) + word2.substring(1);
        System.out.println(output);*/


/*Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
 then print the second word without its first character.
         Input:
             apple
             banana
         Output:
             ppleanana */

    }
}
