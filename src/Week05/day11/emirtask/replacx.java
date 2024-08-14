package Week05.day11.emirtask;

import java.util.Scanner;

public class replacx {
    public static void main(String[] args) {

        /*Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex


         */



        Scanner input = new Scanner(System.in);
        System.out.print("Enter an word: ");
        String word = input.next();

        if (word.startsWith("x")) {

            word = word.replace("x", "a");

        }
        System.out.println(word);

    }
}
