package Tekrar.Tekrar.Array.Lesson.SingleDimensionArray;

import java.util.Arrays;

public class CopyOf {

    public static void main(String[] args) {
        int [] numbers={10,20,30,40,50,60};

        Arrays.copyOf(numbers,3);// first three elemets of this numbers


        int []number= Arrays.copyOf(numbers,3);//[10, 20, 30] --> kelimeyi ve lengthi vercen index degil


        System.out.println(Arrays.toString(number));
        String []names={"Java", "Phyton","C**"+ "RUBY","C++"};


        int [] result= Arrays.copyOf(numbers,4);
        System.out.println(Arrays.toString(result));

        int [] result1= Arrays.copyOf(numbers,9);
        System.out.println(Arrays.toString(result1));//[10, 20, 30, 40, 50, 60, 0, 0, 0]


    }
}
