package Tekrar.Tekrar.Days.Day23Tekrar.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ReplaceAll {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,10,10,10, 4,5,5,6,6,7,7,8,8,8,8,9,99));
        Collections.replaceAll(list,10,100);
        System.out.println(list);//[1, 2, 3, 4, 100, 100, 100, 4, 5, 5, 6, 6, 7, 7, 8, 8, 8, 8, 9, 99]



    }
}
