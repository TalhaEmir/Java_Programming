package Tekrar.Tekrar.ArrayList.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReplaceAll {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,10,30,30,30,0,20,20,20, 2, 3, 4, 5,10));
        System.out.println(list);//[1, 10, 30, 30, 30, 0, 20, 20, 20, 2, 3, 4, 5, 10]

        Collections.replaceAll(list,10,100);

        System.out.println(list);//[1, 100, 30, 30, 30, 0, 20, 20, 20, 2, 3, 4, 5, 100]



    }
}
