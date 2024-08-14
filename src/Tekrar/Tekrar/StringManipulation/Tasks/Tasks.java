package Tekrar.Tekrar.StringManipulation.Tasks;
import java.util.Scanner;

import WEEK01STARTING.DayIntoProgramming.Print;

public class Tasks {


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input.nextLine();


        if(word.startsWith("x")){
            word=word.replaceFirst("x", "a");
        }

        System.out.println(word);



    }



/*
    Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
            Input:
    xcodex
    Output:
    acodex


2. Create a class named ReplaceX, and write a program that asks user to enter a word. and replace all the x or X with character a
    Input:
    xcodeX
    Output:
    acodea


3. Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

            4. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
    apple
            banana
    Output:
    ppleanana

5. Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
    But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

            Input:
    one
            eight
    Output:
    oneight

    */

}
