package week08.day20.Methods;
import java.util.Arrays;

public class CopyMethod {

    public static void main(String[] args) {

        int []numbers={100,200,300,400,500};

        Arrays.copyOf(numbers,3);// 100,200,300

        System.out.println(Arrays.toString(numbers));//result=[100, 200, 300, 400, 500]

        int []result=Arrays.copyOf(numbers,3);
        System.out.println(Arrays.toString(result));//[100, 200, 300]


    }
}
