package Tekrar.Tekrar.Array.Lesson.SingleDimensionArray;
import java.util.Arrays;
public class ToString {

    public static void main(String[] args) {
        int [] numbers={10,20,30,40,40,40};

        System.out.println(numbers);//[I@7b23ec8 it always gave hashcode
        System.out.println(Arrays.toString(numbers));//--> for single dimenisonal array//[10, 20, 30, 40, 40, 40]

    }
}
