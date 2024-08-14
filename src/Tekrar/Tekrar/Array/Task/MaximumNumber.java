package Tekrar.Tekrar.Array.Task;

import java.util.Arrays;

public class MaximumNumber {

    public static void main(String[] args) {
        int [] numbers={10,20,30,40,50,60};

        int [] max= new int[1];//// Uzunluğu 1 olan yeni bir dizi oluştur

        max[0]=numbers[0];

        int maximum=numbers[0];

        System.out.println(Arrays.toString(max));//[10]


        for(int each: numbers){
            if(each>max[0]){
                max[0]=each;
            }
        }
        System.out.println(Arrays.toString(max));


        for(int i=0 ; i<numbers.length ; i++){
            if(numbers[i]> maximum){
                maximum=numbers[i];
            }
        }

        System.out.println(maximum);






    }
}
