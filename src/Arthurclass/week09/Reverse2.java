package Arthurclass.week09;

public class Reverse2 {

    public static void main(String[] args) {
        String example="Talha";
        char[] charArrayOfExample= example.toCharArray();
        System.out.println(charArrayOfExample);

    }

    public static String reverse(String original) {
        String reversed ="";
        char[] charArrayOfOriginal= original.toCharArray();
        for(int i=charArrayOfOriginal.length-1;i>=0;i--){
            reversed+=charArrayOfOriginal[i];

        }
        return reversed;

    }


}