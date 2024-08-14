package week06.Day14.First1HourTASK;

import java.sql.SQLOutput;

public class SecondAnswerForFirstQuestion {

    public static void main(String[] args) {

        System.out.println(combine("asd","ASD"));

    }


    public static String combine(String str1, String str2) {
// of the last character in first string is equal to the first character
        String result;
        if (str1.charAt(str1.length() - 1) == str2.charAt(str2.length() - 1)) {//
            result = str1 + str2.substring(1);// first characcter of the second strong should be execuded in the concatenation
        } else {
            result = str1 + str2;


        }
        return str1 + str2;

    }


}