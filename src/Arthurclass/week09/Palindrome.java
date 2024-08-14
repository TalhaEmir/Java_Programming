package Arthurclass.week09;

public class Palindrome {
    public static void main(String[] args) {
/*2 String Palindrome Task:
    Develop a method named isPalindrome to check if a given string is a palindrome.
			Example:
			 	isPalindrome("Level");

			Output:
			 	true


 */


        System.out.println(isPalindrome("LEVEL"));


    }

    public static boolean isPalindrome(String original){
        String reverse="";


        for (int i = original.length()-1 ; i>=0 ; i--) {
            reverse +=original.charAt(i);
        }
        //equals metod= content

        return reverse.equalsIgnoreCase(original);// harf uyumlulugunu haleetti


    }
}
