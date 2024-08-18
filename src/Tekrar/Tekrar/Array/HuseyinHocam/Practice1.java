package Tekrar.Tekrar.Array.HuseyinHocam;

import java.util.Arrays;

public class Practice1 {
    public static void main(String[] args) {
        int[]scores= new int[5];//
        System.out.println(scores);//[I@7b23ec81


        System.out.println(Arrays.toString(scores));//[0, 0, 0, 0, 0]

        scores[0]=78;
        scores[1]=34;
        scores[2]=44;
        scores[3]=54;
        scores[4]=64;
        //scores[5]=11;


        System.out.println(Arrays.toString(scores));//[0, 0, 0, 0, 0]
           // System.out.println(scores[5]);//[0, 0, 0, 0, 0]

        scores=new int[10];
        System.out.println(Arrays.toString(scores));
    }


}
