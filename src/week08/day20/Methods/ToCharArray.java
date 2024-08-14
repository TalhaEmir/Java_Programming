package week08.day20.Methods;

import week10.Day27.Utilities.ArraysUtility;

import java.util.Arrays;

public class ToCharArray {
    public static void main(String[] args) {

String str="Cydeo School";

char[] ch=str.replace(" ","").toCharArray();

        System.out.println(Arrays.toString(ch));


        System.out.println("===============================");

        String str2="Today is a great day to learn java";
        String[] word=str2.split("Phyton");
        System.out.println(Arrays.toString(word));

        String sentence="Today is a great day";

        //Java love I

        String[]arr=ArraysUtility.reverse( sentence.split(" ") );


        String reversedSentence="";

        for (int i = 0; i < arr.length; i++) {
            reversedSentence+=arr[i]+ " ";
            
        }


        System.out.println(reversedSentence);
        



    }
}
