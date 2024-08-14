package week06.Day14.ShortVideos;

public class OverloadingShortIntro {

    public static void main(String[] args) {

int i=7;
boolean b= i>6;

        sum(1,2,3,4);
        System.out.println(sum(1,2,3,4));
        System.out.println(sum(1,2));

    }

    public static int sum(int a, int b){

        return a + b;


    }

    public static int sum(int a, int b, int c){

        return sum(a,b)+c;
    }

    public static int sum(int a, int b, int c, int d){

        return a + b + c + d;

    }





}
