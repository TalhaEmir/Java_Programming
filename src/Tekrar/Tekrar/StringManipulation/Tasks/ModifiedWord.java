package Tekrar.Tekrar.StringManipulation.Tasks;
import java.util.Scanner;

public class ModifiedWord {

    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your word");
        String word=input.nextLine();
        String reverse="";

        if(word.substring(0,1).equals(word.substring(word.length()-1))){
                reverse= word.substring(1, word.length()-1);

        }else{
                reverse= "*" + word.substring(1)+ (word.length()-2) +"#";
            }
        System.out.println(reverse);
    }
    /*
        //create a program will ask the user to enter a word
        check if the word starts and ends with the same character
        if they are the same delete those caharacters
        abcdea->bcd

        othersie- if the characters are npt the same replace the first charter to be "*"

        abce-> *bcd#
           */
}
