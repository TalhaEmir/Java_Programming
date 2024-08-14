package Week05.day11.tasks;
import java.io.FilterOutputStream;
import java.util.Scanner;
public class Reallynevermind {
    public static void main(String[] args) {
/* Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = scanner.nextLine();
        String result="";



        if (word.length() > 5) {
            if (word.charAt(4) == 'l' && word.charAt(5) == 'y') {
               result="really???";
            } else {
                result="nevermind";
            }


        } else {
            System.out.println("Invalid");


        }

        System.out.println(result);
    }
}
