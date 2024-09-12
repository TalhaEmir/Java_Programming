package Tekrar.Tekrar.Days.Day23Tekrar.ArrayListMethod;

import java.util.ArrayList;
import java.util.Arrays;

public class RetainAll {
    public static void main(String[] args) {
        //retainALL

        ArrayList<Integer> listZeus=new ArrayList<>();

        listZeus.addAll(Arrays.asList(1,2,3,4,5,6,7,7,8));
        System.out.println(listZeus.retainAll(Arrays.asList(1,2,3)));//true



    }
}
