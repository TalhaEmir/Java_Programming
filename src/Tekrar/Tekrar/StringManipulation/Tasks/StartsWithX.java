package Tekrar.Tekrar.StringManipulation.Tasks;

import java.util.Scanner;

public class StartsWithX {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");

        String word=input.nextLine();


        if(word.toLowerCase().contains("x")){
            word=word.replace("x","a");
        }
        System.out.println(word);

    }
}