package Tekrar.Tekrar.ArrayList.Lesson;

import java.util.ArrayList;
import java.util.Arrays;

public class ForEachLoopArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,10,30,30,30,0,20,20,20, 2, 3, 4, 5,10));
        System.out.println(list);//[1, 10, 30, 30, 30, 0, 20, 20, 20, 2, 3, 4, 5, 10]

        list.retainAll(Arrays.asList(10,20)); // it is remove except 10.20
        for(Integer each: list){
            System.out.println(each);
        }

    }
}
