package Tekrar.Tekrar.StringManipulation.Tasks;
import java.util.Scanner;

public class FirstChar {
    public static void main(String[] args) {
        /*. Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
    apple
            banana
    Output:
    ppleanana*/


        Scanner input= new Scanner(System.in);
        System.out.println("Enter a word");
        String word=input.nextLine();
        System.out.println("Enter your second world");
        String word2=input.nextLine();

        String word3= word.substring(1)+ word2.substring(1);

        System.out.println(word3);


    }
}
