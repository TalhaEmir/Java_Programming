package groupworkstrainin.today;

import java.util.Scanner;

public class lastthree {

    public static void main(String[] args) {


/*Create a class named ReallyNeverMind. Ask the user to enter a word. if the word ends with "ly", print "really???" ,  otherwise, print "never mind"

Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
 then print the second word without its first character.
         Input:
             apple
             banana
         Output:
             ppleanana

Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
 But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight
*/

      //1 //
        Scanner input=new Scanner(System.in);
        String word=input.nextLine();

        if(word.endsWith("ly")){
            System.out.println("really???");
        }else {
            System.out.println("nevermind");
        }




    }
}
