package Tekrar.Tekrar.Collections.Task.MergeList;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class MergeList {

    public static void main(String[] args) {


        Integer [] list1= {10, 20, 30, 40, 50, 60, 70};
        Integer [] list2= {30, 40, 50, 60, 70, 80, 90, 100};

        Set<Integer>list3= new TreeSet<>();

        list3.addAll(Arrays.asList(list1));
        list3.addAll(Arrays.asList(list2));

        System.out.println(list3);




    }
}
