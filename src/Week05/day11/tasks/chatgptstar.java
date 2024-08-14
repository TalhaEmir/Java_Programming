package Week05.day11.tasks;

import java.util.Scanner;

public class chatgptstar {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word");
        String word = scanner.nextLine();

        if (word.length() >= 1) {
            char f = word.charAt(0);
            String result = "";

            if (f == 'x') {
                result = word.replaceFirst("x", "a");
                System.out.println(result);
            } else if (f == 'a') {
                result = word.replaceFirst("a", "x");
                System.out.println(result);
            } else {
                System.out.println(word); // Değişiklik yoksa orijinal kelimeyi yazdır
            }

        } else {
            System.out.println("Invalid Word");
        }
    }
}