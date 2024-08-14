package week08.day20.Methods;
import java.util.Arrays;

public class CopyofRangeMethod {

    public static void main(String[] args) {

        int[]numbers={10,20,30,40,50,60,70,80,90};
        //indexes=     0,1, 2,  3, 4, 5,6,  7,  8

        Arrays.copyOfRange(numbers,2,5);// like substring you have to start next line


        int[]result=Arrays.copyOfRange(numbers,2,6);
        System.out.println(Arrays.toString(result));// for 50 we have to give index 5 for 60 should 6
    }
}
