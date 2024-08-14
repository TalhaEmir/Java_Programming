package week08.day20.Methods;
import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

     //  int[][]arr2D=new int[3][]; yani iki tane paragrafin icinde 3 tane kume olacak demek

        int[][] arr2D = {{1,2,3},{4,5,6,7},{8,9,10,11,12}};
        System.out.println(arr2D.length);//3
        System.out.println(Arrays.deepToString(arr2D));//[[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]




    }
}
