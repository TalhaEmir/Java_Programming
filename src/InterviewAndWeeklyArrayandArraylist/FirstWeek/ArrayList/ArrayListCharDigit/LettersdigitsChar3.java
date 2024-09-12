package InterviewAndWeeklyArrayandArraylist.FirstWeek.ArrayList.ArrayListCharDigit;

import java.util.ArrayList;
import java.util.Arrays;

public class LettersdigitsChar3 {

    public static void main(String[] args) {
        String str="Wooden Spoon123!";

        String digit=""; String letters=""; String specialChars="";


        char [] str1= str.toCharArray();

        Character [] str2= new Character [str1.length];

        for (int i = 0; i < str1.length; i++) {
            str2[i] = str1[i];
        }


        ArrayList<Character> str3= new ArrayList<>(Arrays.asList( str2));

        for (Character ch :  str3) {
            if (Character.isLetter(ch)) {
                letters += ch;
            } else if (Character.isDigit(ch)) {
                digit += ch;
            } else {
                specialChars += ch;
            }
        }

        System.out.println("Letters from ArrayList: " + letters);
        System.out.println("Digits from ArrayList: " + digit);
        System.out.println("Special Characters from ArrayList: " + specialChars);

    }


}
