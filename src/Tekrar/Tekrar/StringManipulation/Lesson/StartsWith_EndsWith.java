package Tekrar.Tekrar.StringManipulation.Lesson;

public class StartsWith_EndsWith {

    public static void main(String[] args) {

        String url="www.amazon.com";

        boolean r1=url.startsWith("www.");

        boolean r2=url.endsWith(".com");

        System.out.println(r1);//true
        System.out.println(r2);//true



    }
}
