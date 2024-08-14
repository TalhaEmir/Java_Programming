package Arthurclass.week09;

public class Reverse3 {

    public static void main(String[] args) {

        System.out.println(reverse("Cydeo"));

    }

    public static String reverse(String original) {
        char[] reversedOfOriginal = new char[original.length()];

        //reverse.length-1= in here "o"
        for (int i = reversedOfOriginal.length-1, j=0; i>=0 ; i--, j++) {
            reversedOfOriginal[i]=original.charAt(j);

        }
        return new String(reversedOfOriginal);
    }
}
