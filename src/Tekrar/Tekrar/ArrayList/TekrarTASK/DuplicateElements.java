package Tekrar.Tekrar.ArrayList.TekrarTASK;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {

    public static void main(String[] args) {
        Integer [] arr1= {1,2,3,4,5};



        ArrayList<Integer>list1= new ArrayList(Arrays.asList(1,2,3,4,5));
        int size= list1.size();


        for(int i=0 ; size>i ; i++){
            list1.add(list1.get(i));
        }
        System.out.println(list1);


    }
}
