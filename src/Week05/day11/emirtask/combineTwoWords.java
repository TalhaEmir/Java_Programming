package Week05.day11.emirtask;

import java.util.Scanner;

public class combineTwoWords {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a one word");
        String word = input.nextLine();
        System.out.println("Enter second word");
        String secondWord = input.nextLine();
        String result="";

        input.close();

       if (word.charAt(word.length()-1) == secondWord.charAt(0)) {
           result=word+secondWord.substring(1);


       }



    }
}
