package Tekrar.Tekrar.ArrayList.Tasks.UpperCaseAndLowerCase;

public class UpperCaseLowerCase {

    public static void main(String[] args) {


    }


    public static boolean upperLowerMatch(String str) {
        int upper = 0;
        int lower = 0;

        for (char each : str.toCharArray()) {
            if (Character.isUpperCase(each)) {
                upper++;
            } else if (Character.isLowerCase(each)) {
                lower++;

            }



        }

        return upper == lower;

    }
}