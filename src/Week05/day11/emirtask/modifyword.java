package Week05.day11.emirtask;

import java.sql.SQLOutput;
import java.util.Scanner;

public class modifyword {
    public static void main(String[] args) {

        /*/*
ModifyWord [indexes, conditional]

    Create a program that will ask the user to enter a word.
    Check if the word starts and ends with the same character.
        If they are the same delete those characters
            abcda -> bcd
    Additional/Otherwise:
    if the characters are not the same replace the first charter to be '*' and the last character to be #
        abcde -> *bcd#
    print the results
 */
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");
        String word= input.nextLine();
        String result="";


        if(word.charAt(0)== word.charAt(word.length()-1)){
            result=word.substring(1,word.length()-1);

        } else{
            result="*"+word.substring(1,word.length()-1)+"*";

        }
        System.out.println(result);

        boolean result2= true;
        if(result2){
            System.out.println("Its true");
        }


    }






    }

