package Tekrar.Tekrar.ArrayList.TekrarTASK;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NumberOfZero {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,0,2,0,3,0,4,0));

        int numberOfZero= Collections.frequency(list,0);

        System.out.println(numberOfZero);


        list.removeAll(Arrays.asList(0));


        for(int i = 0; i < numberOfZero; i++){
            list.add(0);
        }

        System.out.println(list);

    }
}
