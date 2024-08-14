package groupworkstrainin.today;

import java.util.Scanner;

public class CombineWord {

    public static void main(String[] args) {
        /*Create a class named CombineWords. Ask user to enter two words. Then add them together and print.
 But if the last letter if the first word and the first letter of the last letter is the same, print that character once.

                Input:
                    one
                    eight
                Output:
                    oneight */


        String first = "one";
        String second = "eight";
        String output="";

        if (first.charAt(first.length() - 1) == second.charAt(0)) {
            output = first + second.substring(1);


        }

        System.out.println(output);

    }


}
