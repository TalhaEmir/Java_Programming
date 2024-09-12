package Tekrar.Tekrar.Collections.Task.RemoveDuplicate;

import java.util.*;

public class RemoveDuplicates3 {

    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();


        list1.addAll(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));


        List<Integer>list2=new ArrayList<>();


        for(Integer each: list1){
            if(!list2.contains(each)){
                list2.add(each);
            }
        }

        System.out.println(list2);

        Collections.sort(list2);

        System.out.println(list2);//[0, 10, 15, 20, 30]





    }
}
