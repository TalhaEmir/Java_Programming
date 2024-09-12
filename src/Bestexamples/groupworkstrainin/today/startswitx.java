package Bestexamples.groupworkstrainin.today;

public class startswitx {
    public static void main(String[] args) {
       /* Create a class named StartsWithX and write a program that asks user to enter a word. If the work starts with x, replace it with a.
                Input:
        xcodex
        Output:
        acodex

        */

       String first="xcodex";

       first=first.replaceFirst("x","a");

        System.out.println(first);


    }
}
