package week08.day21.Task;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[]array={1,2,3,4,5,6,7,8,9};
        //int[]reverse= Arrays.copyOf(array,array.length);// or
        int[]reverse=new int[array.length];

        for(int i=array.length-1;i>=0;i--){
            System.out.print(array[i]+" ");
            array[i]=reverse[i];
        }
        System.out.println(Arrays.toString(array));
    }
}
