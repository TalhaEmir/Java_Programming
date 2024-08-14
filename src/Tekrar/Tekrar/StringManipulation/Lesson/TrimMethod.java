package Tekrar.Tekrar.StringManipulation.Lesson;

public class TrimMethod {
    public static void main(String[] args) {

        String str=" CYDEO  ";

        System.out.println(str);// CYDEO

        str.trim();

        System.out.println(str);//  CYDEO

        str=str.trim();

        System.out.println(str);//CYDEO


    }
}
