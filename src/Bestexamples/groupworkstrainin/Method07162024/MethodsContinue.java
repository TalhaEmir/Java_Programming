package Bestexamples.groupworkstrainin.Method07162024;

import java.util.Scanner;

public class MethodsContinue {
    public static void main(String[] args) {
        /* Create a method named combine that can take two string and hen add them together and returns it.
            But if the last letter of the first word and the first letter of the last letter are the same,
            return that character once.

            combine("one", "eight")  ==> oneight*/

        Scanner input = new Scanner(System.in);
        System.out.println("Enter word: ");
        String word1 = input.nextLine();
        System.out.println("Enter a second word: ");
        String secondWord = input.nextLine();
        System.out.println(word(word1, secondWord));



    }

    public static String word(String a, String b){
        String result="";

        if (a.charAt(a.length()-1) == b.charAt(0)){
            result=a.substring(0)+b.substring(1);
        }
        return result;




    }
}
