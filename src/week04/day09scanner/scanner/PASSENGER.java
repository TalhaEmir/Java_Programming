package week04.day09scanner.scanner;

import java.util.Scanner;

public class PASSENGER {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How many people they live with ? ");
        int people = input.nextInt();
        String result="";

        if (people < 3) {
            result = "Live with less than 3 people";
        } else if (people>= 3 && people<=6 ) {
            result="Live with 3 - 6 people!";

        } else if (people > 6) {
            result="Live with more than people!";
        }

        System.out.println(result);
    }
}
