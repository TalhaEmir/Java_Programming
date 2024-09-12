package Tekrar.Tekrar.Days.Day23Tekrar.ArrayListMethod;

import java.util.ArrayList;

public class dememe {

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);numbers.add(40);
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

      numbers.addAll(1,list1);

    }
    }
