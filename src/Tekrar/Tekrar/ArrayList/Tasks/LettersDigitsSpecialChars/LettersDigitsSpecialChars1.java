package Tekrar.Tekrar.ArrayList.Tasks.LettersDigitsSpecialChars;

import java.util.ArrayList;
import java.util.Arrays;

public class LettersDigitsSpecialChars1 {

    public static void main(String[] args) {

        String str = "uh987)(*^&*^dksai23IJFJI22414^&DSA^uh552352F";
        String digit = "", letters = "", specialChars = "";

        for  (char eachChar: str.toCharArray()){
            if(Character.isLetter(eachChar)){
                letters += eachChar;
            }else if(Character.isDigit(eachChar)){
                digit+= eachChar;
            }else if(!(Character.isLetterOrDigit(eachChar))){
                specialChars += eachChar;

            }
        }


        System.out.println(letters);
        System.out.println(digit);
        System.out.println( specialChars);


        String str1="uh987)(*^&*^dksai23IJFJI22414^&DSA^uh552352F";

        String digit1 = "", letters1 = "", specialChars1 = "";

        char [] eachChar= str.toCharArray();


        // Converting char[] to Character[] for using Arrays.asList
        Character[] eachCharWrapper = new Character[eachChar.length];
        for (int i = 0; i < eachChar.length; i++) {
            eachCharWrapper[i] = eachChar[i];
        }

        ArrayList<Character> list = new ArrayList<>(Arrays.asList(eachCharWrapper));

        // Loop through the list to categorize each character
        for (Character ch : list) {
            if (Character.isLetter(ch)) {
                letters1 += ch;
            } else if (Character.isDigit(ch)) {
                digit1 += ch;
            } else {
                specialChars1 += ch;
            }
        }

        System.out.println("Letters from ArrayList: " + letters1);
        System.out.println("Digits from ArrayList: " + digit1);
        System.out.println("Special Characters from ArrayList: " + specialChars1);








    }





}
