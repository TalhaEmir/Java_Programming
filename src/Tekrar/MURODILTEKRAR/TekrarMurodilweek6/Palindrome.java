package Tekrar.MURODILTEKRAR.TekrarMurodilweek6;

public class Palindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome("asa"));

    String word="HIH";

    String reverse="";



        for (int i = word.length()-1; i >=0 ; i--) {
            reverse=reverse+word.charAt(i);
        }
        System.out.println("reverse is " + reverse);
        if (word.equals(reverse)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }

    public static boolean isPalindrome(String word) {
        String reverse="";
        for (int i = word.length()-1; i >=0 ; i--) {
            reverse=reverse+word.charAt(i);
        }
        return reverse.equals(word);
    }







}
