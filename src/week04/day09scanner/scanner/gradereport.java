package week04.day09scanner.scanner;

import java.util.Scanner;

public class gradereport {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("What is your score");
        int score = input.nextInt();
        String result="";

        if (score <= 100 && score >= 0) {
            if (score <= 100 && score >= 85) {
                result="A";
            }else if (score < 85 && score >= 75) {
                result="B";
            } else if (score<75 && score>65) {
                result="C";
            }else if (score<65 && score>45) {
                result="D";
            }

        }else {
            result="Invalid Score";

        }

        System.out.println("Your result is " + result);
    }
}
