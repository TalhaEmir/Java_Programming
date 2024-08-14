package week08.day20.Methods;
import java.util.Arrays;

public class SortMethod {

    public static void main(String[] args) {

        int[]numbers={100,50,20,10,80,90,60,30,20,40};

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String []words={"Ruby","Java","Phyton","C#"};//ascii table c is lower
        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

    }
}
