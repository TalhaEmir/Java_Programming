package Tekrar.Tekrar.Array.Task2;

import java.util.Arrays;

public class Multiply {

    public static void main(String[] args) {


        int []array= {1,2,3,4,5};

        for(int i= 0; i<array.length ; i++){
            if(!(array[i]%2==0)){
                array[i]=array[i]*2;
            }
        }

        System.out.println(Arrays.toString(array));

    }
}
