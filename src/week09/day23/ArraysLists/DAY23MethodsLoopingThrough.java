package week09.day23.ArraysLists;

import java.util.ArrayList;

public class DAY23MethodsLoopingThrough {

    public static void main(String[] args) {

       ArrayList<Integer> list=new ArrayList<>();
       list.add(10);
       list.add(20);
       list.add(30);
       list.add(40);
       list.add(50);

        for (int i = 0; i < list.size(); i++) {//list.size()-1 last index number
            System.out.println(list.get(i));

            ArrayList<String> list1=new ArrayList<>();
            list1.add("Hello");
            list1.add("World");
            list1.add("Java");
            list1.add("Phyton");

            for(String each :list1){//for that one you dont need
                // that iteration means i because it is fixed
                System.out.println(each);
            }

            //for// sadece for tiklarsan direk geliyor
            for(int each :list){}// gibi
        }

    }
}
