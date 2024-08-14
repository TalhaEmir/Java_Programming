package Arthurclass.week09;

public class Reverse {

    public static void main(String[] args) {

       /* 1. String Reverse Task:
        Create a method to reverse a given string and provide the reversed result.
                Example:
        reverse("Cydeo");
        Output:
        "oedyC"*/
        System.out.println(reverse2("Arthur"));


        reverse("Arthur");


        //without using custom method

        String original= "Cydeo";
        // we should take one by one char

        String reverse="";


//charat method
        for (int i = original.length()-1 ; i>=0 ; i--) {
           reverse +=original.charAt(i);
        }

        System.out.println("reverse =" + reverse);




    }


    public static void reverse(String original) {
        String reverse="";


        for (int i = original.length()-1 ; i>=0 ; i--) {
            reverse +=original.charAt(i);
        }

        System.out.println("reverse =" + reverse);
    }

    public static String reverse2(String original) {
        String reverse="";


        for (int i = original.length()-1 ; i>=0 ; i--) {
            reverse +=original.charAt(i);
        }

        return reverse;
    }


}
