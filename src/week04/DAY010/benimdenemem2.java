package week04.DAY010;
import java.util.Scanner;

public class benimdenemem2 {

    public static void main(String[] args) {

        //find last letter of n1
/*
        String n1="Istanbulun Ufak Tefek Taslari";
        char firstletter=n1.charAt(0);
        System.out.println(firstletter);
        int length=n1.length();
        System.out.println(length);
        int LastIndex=length-1;
        System.out.println(LastIndex);
        char lastLetter= n1.charAt(28);
        System.out.println(lastLetter);

 */

        System.out.println("===================");

        String str="Wooden Spoon";
        char ch1=str.charAt(7);
        System.out.println(ch1);
        int length=str.length();
        System.out.println(length);
       int valIndex= length-1;
       System.out.println(valIndex);
       char lastLetter=str.charAt(valIndex);
       System.out.println(lastLetter);
    }
}
