package week03.Day06ifstataement.tasks;

public class NumbertoWord {

    public static void main(String[] args) {

        int number= 1;
        boolean invalid= number<1 || number>9;
        String result="";

        if (number>0 && number<10) {

            if (number == 1) {
                result = "One";
            } else if (number == 2) {
                result = "Two";
            } else if (number == 3) {
                result = "Three";
            } else if (number == 4) {
                result = "Four";
            } else if (number == 5) {
                result = "Five";
            } else if (number == 6) {
                result = "Six";
            } else if (number == 7) {
                result = "Seven";
            } else if (number == 8) {
                result = "Eight";
            } else {
                result = "Nine";
            }
            System.out.println(result);
        }else{
            System.out.println("Number is =" + invalid);
        }

    }
}
