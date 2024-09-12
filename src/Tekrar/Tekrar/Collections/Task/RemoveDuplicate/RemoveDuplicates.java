package Tekrar.Tekrar.Collections.Task.RemoveDuplicate;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

        /*Create a class named RemoveDuplicates and write a program that takes a list of integers, removes any duplicate values, and returns the elements in sorted order.

         Example:
            {20, 15, 10, 20, 30, 10, 20, 15, 0}

         Output:
            {0, 10, 15, 20, 30}
*/


        List<Integer>list1=new ArrayList<>();


        list1.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));


        List<Integer>list2=new ArrayList<>();


        for(Integer each: list1){
            if(!list2.contains(each)){
                list2.add(each);
            }
        }

System.out.println(list2);

        Set<Integer>list3= new TreeSet<>();

        list3.addAll(list2);

        System.out.println(list3);


    }
}
