package Tekrar.Tekrar.Array.Task;

import java.util.Arrays;

public class ArrayElements {
    public static void main(String[] args) {

        int [] numbers=new int[100];



        for(int i=1; i<=100 ; i++){
            numbers[i-1]=i;
           // nums[i-1]--> converts the i which is the number to an index
        }


        System.out.println(Arrays.toString(numbers));


        for(int i=0; i< numbers.length ; i++){

           System.out.println(numbers[i] + " ");
        }


        for(int i=numbers.length-1; i>=0 ; i--){

            System.out.println(numbers[i] + " ");
        }

        for(int i=0; i< numbers.length ; i++){
            if(numbers[i]%5==0){
                System.out.print(numbers[i]+ " ");
            }
        }



    }
}
