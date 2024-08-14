package Tekrar.ArthurTekrar.Week09;

public class Palindrome {
    public static void main(String[] args) {
/*
        *2 String Palindrome Task:
        Develop a method named isPalindrome to check if a given string is a palindrome.
        Example:
        isPalindrome("Level");

        Output:
        true

*/

        System.out.println( palindrome("teddo"));


    }

    public static boolean palindrome(String word){
        String reverse="";



        for(int i= word.length()-1 ; i>=0  ; i-- ){
            reverse +=word.charAt(i);
            for(int j=0;  j<word.length()-1; j++){
                if(reverse.equals(word.charAt(j))) {
                   return true;
                }
            }

        }
        return false;
    }
}

