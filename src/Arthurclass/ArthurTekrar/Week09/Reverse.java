package Arthurclass.ArthurTekrar.Week09;

public class Reverse {
    public static void main(String[] args) {
         /* 1. String Reverse Task:
        Create a method to reverse a given string and provide the reversed result.
                Example:
        reverse("Cydeo");
        Output:
        "oedyC"*/

        System.out.println(reverse("teddo"));
    }

    public static String reverse(String word){
        String result="";

        for(int i=word.length()-1 ; i>=0; i--){
            result += word.charAt(i) + "";
        }
        return result;
    }


}
