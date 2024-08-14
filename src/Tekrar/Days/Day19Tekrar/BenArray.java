package Tekrar.Days.Day19Tekrar;
import java.util.Arrays;

public class BenArray {
    public static void main(String[] args) {


        int[]score=new int[10];// it means there 10 ten elements
//ikisinden biri
        String []salt={"a","B","c"};// there 3 elemtn written

        System.out.println(Arrays.toString(salt));
        //[a, B, c]

        int[]numbers;
        numbers= new int[5]; // maximum number 4 . you can not change this number its size gonna be 5. there must be 5 elements
        //int[] numbers= new int[5] // if there is number 5 index number gonna be 4 it start from 0 to 4 but item gonna be 5
        //index numbers always start from 0

        numbers [1]=20;// if we want to index number 0 or 1 we gonna put this bracket it is call element that at the index 0 or 1
        numbers[4]=30;

        int[]nums;
        nums=new int[5];

        int[] arr1={10,20,30,40,50};
        int[] arr2=arr1;
        int[] arr3=arr2;



        arr1[0]=1000;
        arr2[2]=3000;
        // if you have one array object you can attach multiple variables





    }
}
