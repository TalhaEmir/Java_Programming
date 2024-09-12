package Tekrar.Tekrar.Days.Day23Tekrar.ArrayListMethod;

import java.util.ArrayList;

public class MethodsLoopingThrough {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

       for(int i= 1; i<list.size() ; i++){
           System.out.println(list.get(i));
       }

    }
}
