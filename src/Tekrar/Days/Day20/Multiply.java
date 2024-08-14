package Tekrar.Days.Day20;

import java.util.Arrays;

public class Multiply {
    public static void main(String[] args) {

        int[]summoning={1,2,3,4,5};

        for (int i = 0; i < summoning.length; i++) {

            if(summoning[i]%2!=0){
                summoning[i]=summoning[i]*2;
            }

        }

        System.out.println(Arrays.toString(summoning));

    }
}
