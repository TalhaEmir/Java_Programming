package Tekrar.Tekrar.StringManipulation.Lesson;

public class IndexOf {

    public static void main(String[] args) {

        String str="java Programming Language";
        str.indexOf("a");
        System.out.println( str.indexOf("a"));//1
        int num=str.indexOf("a");
        System.out.println(num);//1

        str.indexOf("am");
        System.out.println( str.indexOf("am"));//10 the first letter
    }
}
