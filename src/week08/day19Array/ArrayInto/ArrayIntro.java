package week08.day19Array.ArrayInto;

import java.util.Arrays;
public class ArrayIntro {

    public static void main(String[] args) {



    int score1=85;
    int score2=75;
    int score3=78;
    int score4=88;
    int score5=95;

        System.out.println("=================");


        int []scores= new int[5];// index 0-4 first index always 0 -- then it is eligilbe for garbage collection
            scores[0]=85;// garbage
            scores[2]=78;//garbage
            scores[1]=75;// garbage
            scores[3]=88;// garbage
            scores[4]=95;// garbage
        //because besli olani 10 un degeriyle ezdik
           // scores[5]=100;
           // scores[-1]=65;
        System.out.println(Arrays.toString(scores));

        //scores= new int[10];// index 0-9// eligible for gabage collection
       // scores=new int[50]; // it is 50 zeros in here
        System.out.println(Arrays.toString(scores));

        System.out.println(scores[2]);

        System.out.println("=========================");

        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
            
        }
        System.out.println("=========================");


        System.out.println(scores[scores.length-1]);



    }


}
