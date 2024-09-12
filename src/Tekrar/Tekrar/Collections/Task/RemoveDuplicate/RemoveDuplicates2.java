package Tekrar.Tekrar.Collections.Task.RemoveDuplicate;

import java.util.*;

public class RemoveDuplicates2 {

    public static void main(String[] args) {

        List<Integer> list1=new ArrayList<>();


        list1.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));

        Set<Integer> list3= new TreeSet<>( list1);
        Set<Integer> list2= new TreeSet<>( Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));



        System.out.println(list3);
        System.out.println(list2);






    }
}
