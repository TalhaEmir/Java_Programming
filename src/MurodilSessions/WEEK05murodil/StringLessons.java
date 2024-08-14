package MurodilSessions.WEEK05murodil;
import java.util.Scanner;

public class StringLessons {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

        String str="Java";

        str.charAt(0);
        System.out.println(str.charAt(0));


        String str1="hi";
        //get number of chars
        //index= 01
        System.out.println("length= "+str1.length());
        System.out.println("first char "+ str1.charAt(0));
            System.out.println(str1);



        char secondletter=str.charAt(1);


        System.out.println(str1.length()); // int hs length we don't need to put anything
        System.out.println("first char= "+ str1.charAt(0)); //but we can not leave char empty
        System.out.println("second letter= "+ str1.charAt(1));

            System.out.println(str1);
            System.out.println("===============================");

        //make all uppercase then take first character
        str1= str1.toUpperCase();//HI
        System.out.println(str1.charAt(0));//H

        String str2="hello";
        System.out.println(str2.toUpperCase().charAt(0));//H
        System.out.println(str2.toUpperCase().charAt(2));//L
        char second=str2.toUpperCase().charAt(1);
        System.out.println(str2);

        System.out.println("===============================");
        //ERROR-> str2=str2.toUppercase().charAt(0);
        System.out.println("second ="+ second);

        //the print last character
        System.out.println("last= "+ str2.charAt(4));
        //System.out.println("last=") str2.charAt(str2.length())); // string index out of range
        //nesting string methods
        System.out.println(("last=" + str2.charAt(str2.length()-1) ));

        // convert ot uppercase then get second to last character in one statement
        // hello -> HELLO--> CHARaT(3)---> L
        System.out.println(str2.toUpperCase().charAt(str2.length()-2));











    }
}
