package Week05.day11.tasks;
import java.util.Scanner;

public class reallynevermind1 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = scan.next();
        String lastTwoChars = word.substring( word.length()-2 );
        System.out.println(lastTwoChars);

    }

}
/*
4. Create a class named ReallyNeverMind. Ask the user to enter a word.
if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

 */


