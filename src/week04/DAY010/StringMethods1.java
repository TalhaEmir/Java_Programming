package week04.DAY010;

import java.util.Scanner;

public class StringMethods1 {
    public static void main(String[] args) {


        String str="Cydeo";

        // index:01234 index numbers start from zero

        char firstChar=str.charAt(0);
        char secondChar=str.charAt(1);
        char thirdChar=str.charAt(2);
        char fourthChar=str.charAt(3);
        char fifthChar=str.charAt(4);

        System.out.println("firstChar = " + firstChar);
        System.out.println("secondChar = " + secondChar);
        System.out.println("thirdChar = " + thirdChar);
        System.out.println("fourthChar = " + fourthChar);
        System.out.println("fifthChar = " + fifthChar);



        System.out.println("====================");

        String sentence="Java Programming Language";
        sentence.length();
        int length=sentence.length();
        System.out.println("length = " + length);

        int lastIndex=length-1;

        System.out.println(lastIndex);

        System.out.println("==============================");

        String s1="Java is the best programming language";

        char f=s1.charAt(0);
        int lastIndex1=s1.length()-1;

        System.out.println(lastIndex1);
        char l=s1.charAt(lastIndex1);

        System.out.println(f + " : " + l);

        System.out.println("=========================================");



        String name1="Umran";
        String name2=new String("Umran");

        System.out.println(name1==name2);
        System.out.println(name1.equals(name2));


        System.out.println("===============================");


        String r1="Java";
        String r2="Java";
        String r3=new String("Java");

        System.out.println(r1==r2);// true if it same object at the pool
        System.out.println(r1==r3);// false
        System.out.println(r2==r3);// false// it is not same object because we use new and it creates new object

        System.out.println(r1.equals(r2));// true
        System.out.println(r1.equals(r3));// true


        System.out.println("=============================");

        Scanner input=new Scanner(System.in);

        System.out.println("How old are you?");
        int age=input.nextInt();

        System.out.println("Are you a US citizen? yes/ no");
        String answer=input.next();

        if(age>=21 && answer.equals("yes")){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not Eligible to vote");
        }














    }
}
