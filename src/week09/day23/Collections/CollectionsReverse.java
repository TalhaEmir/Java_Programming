package week09.day23.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsReverse {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8,9,0,0,1,2,3,45,5,6,0,-5,300,0,-5));

        System.out.println(list);//[1, 2, 3, 4, 5, 6, 7, 8, 8, 9, 0, 0, 1, 2, 3, 45, 5, 6, 0, -5, 300, 0, -5]


        Collections.sort(list);


        System.out.println(list );//[-5, -5, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 45, 300]

        Collections.reverse(list);

        Collections.sort(list);//[-5, -5, 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6, 7, 8, 8, 9, 45, 300]

        System.out.println();

    }
}