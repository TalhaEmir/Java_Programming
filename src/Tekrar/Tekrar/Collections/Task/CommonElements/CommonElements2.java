package Tekrar.Tekrar.Collections.Task.CommonElements;

import java.util.*;

public class CommonElements2 {

    public static void main(String[] args) {

        Set<Integer> list1= new LinkedHashSet<>(Arrays.asList(10, 8, 11, 20, 5, 0));
        Set<Integer> list2= new LinkedHashSet<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));


        List<Integer>list3= new ArrayList<>();

        list3.addAll(list1);
        list3.addAll(list2);

        list3.removeIf(p->Collections.frequency(list3,p)>1);

        System.out.println(list3);
    }
}
