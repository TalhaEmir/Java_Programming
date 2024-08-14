package Week05.day11.tasks;

import java.util.Scanner;

public class withoutfirstchar {

    public static void main(String[] args) {
        /*Create a class named WithoutFirstChar. Ask user to enter two words. Print first word without its first character
    then print the second word without its first character.
            Input:
                apple
                banana
            Output:
                ppleanana

         */
        Scanner sc = new Scanner(System.in);

        System.out.println("Ask the user enter two words");
        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        System.out.println(word1.substring(1)+word2.substring(1));




    }
}
