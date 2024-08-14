package Tekrar.Tekrar.Array.Task;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {

        int [] array={10, 0, 5,2, 0, 1, 0,2,2};
        int [] moved= new int[array.length];//[000]


        System.out.println(Arrays.toString(array));//[0, 0, 0, 1, 5, 10]

        for(int i= 0 , y=0; i<array.length; i++){
            if(array[i]!=2) {
                moved[y]=array[i];
                y++;
            }

        }





        System.out.println(Arrays.toString(moved));





    }
}
