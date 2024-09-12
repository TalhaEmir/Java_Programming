package Tekrar.Tekrar.ArrayList.Collections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraysCollectionsMinandMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,10,30,30,30,0,20,20,20, 2, 3, 4, 5,10));
        System.out.println(list);//[1, 10, 30, 30, 30, 0, 20, 20, 20, 2, 3, 4, 5, 10]

        System.out.println(Collections.min(list));//0
        System.out.println(Collections.max(list));//30


        String str="13";
        String str1="13";

        Integer num= Integer.valueOf(str);

        int num1=Integer.parseInt(str1);

    }
}
