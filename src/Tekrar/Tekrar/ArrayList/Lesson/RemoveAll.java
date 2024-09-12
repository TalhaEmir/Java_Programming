package Tekrar.Tekrar.ArrayList.Lesson;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveAll {
    public static void main(String[] args) {
       ArrayList <Integer> list2 = new ArrayList<>(Arrays.asList(1,10,30,30,30,0,20,20,20, 2, 3, 4, 5,10));

        list2.removeAll(Arrays.asList(20));
       list2.removeAll(Arrays.asList(10,30));//[1, 0, 2, 3, 4, 5]


        System.out.println(list2);//[1, 2, 3, 4, 5]



// Veya doğrudan elemanlarla:

        List<String> list3  = Arrays.asList("apple", "banana", "cherry");



        list2.removeAll(Arrays.asList(10,20));

    }
}
