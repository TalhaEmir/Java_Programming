package Week05.day11.emirtask;

import java.util.Scanner;

public class withoutfirstchar {

    public static void main(String[] args) {

        System.out.println("Enter two word");
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        String word2 = input.nextLine();

        word = word.substring(1);
        word2 = word2.substring(1);

        System.out.println(word+word2);



        
    }
}
