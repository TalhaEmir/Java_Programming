package Tekrar.Tekrar.ArrayList.TekrarTASK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));


        list2.retainAll(Arrays.asList(2,4));

        System.out.println(list2);


        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5));

        list3.removeIf(p-> Collections.frequency(list3,p)>1);


    }
}
