package Tekrar.Tekrar.Collections.Task.MergeList;

import java.util.*;

public class MergeTwoList2 {

    public static void main(String[] args) {
        List<Integer> num1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50, 60, 70));
        List<Integer> num2 = new ArrayList<>(Arrays.asList(30, 40, 50, 60, 70, 80, 90, 100));

        num1.addAll(num2);

        Set<Integer> list3= new LinkedHashSet<>(num1);

        System.out.println(list3);


        List<Integer>uniqueList=new ArrayList<>(list3);

        System.out.println(uniqueList);

    }
}
