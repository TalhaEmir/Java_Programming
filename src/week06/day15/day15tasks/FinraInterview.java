package week06.day15.day15tasks;

public class FinraInterview {
 /*Create a class named FINRA. and write a program that prints the numbers from 1 to 100. For numbers that
        are multiples of both 3 and 5, print "FINRA" instead of the number. For numbers that are multiples of 3, print
        "FIN" instead of the number, and for numbers that are multiples of 5, print "RA" instead of the number.

        Example:
        1 2 FIN 4 RA FIN 7 8 FIN RA 11 FIN 13 14 FINRA 16 17 FIN...*/

    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            boolean divBy3 = i % 3 == 0;// because number 100
            boolean divBy5 = i % 5 == 0;

            String result = "";


            if (divBy3 && divBy5) {
                result = "FINRA";
            } else if (divBy3) {
                result = "FIN";
            } else if (divBy5) {
                result = "RA";
            } else {
                result = " " + i;
            }
            System.out.print(result + " ");

        }
    }

}