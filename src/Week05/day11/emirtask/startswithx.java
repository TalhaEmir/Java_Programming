package Week05.day11.emirtask;

import java.util.Scanner;

public class startswithx {

    public static void main(String[] args) {

        System.out.println("Enter a word");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();

        if (word.contains("x")) {
            word=word.replace("x","a").replace("X","a");
        }

        System.out.println(word);
    }
}
