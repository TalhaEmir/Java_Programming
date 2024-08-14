package week09.day23.ArraysLists;

import java.util.ArrayList;

public class Day23MethodsReverseOrder {
    public static void main(String[] args) {

    ArrayList<Integer> list=new ArrayList<>();
    list.add(10);
    list.add(20);
    list.add(30);
    list.add(40);
    list.add(50);

    for (int i = list.size(); i>0 ; i--) {//list.size()-1 last index number
        System.out.println(list.get(i));



    }

}
}


