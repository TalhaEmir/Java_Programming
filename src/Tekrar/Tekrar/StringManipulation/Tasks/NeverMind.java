package Tekrar.Tekrar.StringManipulation.Tasks;
import java.util.Scanner;

public class NeverMind {


    /*3. Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"
*/

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input.nextLine();

        if(word.endsWith("ly")){
            System.out.println("really???");
        }else{
            System.out.println("never mind");
        }
    }
}
