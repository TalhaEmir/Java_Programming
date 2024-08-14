package Tekrar.Tekrar.Array.Lesson.SingleDimensionArray;

import java.util.Arrays;

public class SortMethod {

    public static void main(String[] args) {
        int [] numbers={10,20,30,40,50,60};


        Arrays.sort(numbers);
        System.out.println(numbers);//[I@6f496d9f

            System.out.println(Arrays.toString(numbers));//[10, 20, 30, 40, 50, 60]


            String []names={"Java", "Phyton","C**"+ "RUBY","C++"};

            Arrays.sort(names);


            System.out.println(Arrays.toString(names));//[C**RUBY, C++, Java, Phyton]


    }
}
