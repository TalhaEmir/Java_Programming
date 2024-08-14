package Week05.day11.emirtask;

import java.util.Scanner;

public class rellaynevermind {


    public static void main(String[] args) {

    /*
    Create a class named ReallyNeverMind
     Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"


     */

        System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);
        String word = input.next();

        if (word.endsWith("ly")) {
            System.out.println("really?");
        }else{
            System.out.println("never mind");
        }

    }
}
