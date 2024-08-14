package week09.day23.ArraysLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Day23Methods2 {

    public static void main(String[] args) {
        //containsall method

        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1.add(10);
        list1.add(20);
        list1.add(30);


        ArrayList<Integer>list2=new ArrayList<>();
        list2.add(40);
        list2.add(50);
        list2.add(60);
        list2.add(70);
        list2.add(80);
        list2.add(90);

        boolean r1= list2.containsAll(list1);
        System.out.println(r1);//false
        //list2.containsAll(40,30,20,49);// compiler cunku liste veremezsin boyle ama
        boolean r2=list2.containsAll(Arrays.asList(40,30,20,49));//aslist multiple elementi icinme yazmaya yariyor
        System.out.println(r2);//false



        ArrayList<Integer> list11=new ArrayList<>();
        list11.add(10);
        list11.add(20);
        list11.add(30);



        ArrayList<Integer>list22=new ArrayList<>();
        list22.add(40);
        list22.add(50);
        list22.add(60);
        list22.add(70);
        list22.add(80);
        list22.add(90);
        ArrayList<Integer>list23=new ArrayList<>();
        list23.add(10);
        list23.add(20);
        list23.add(30);

        list22.addAll(list11);
        System.out.println(list22);//[40, 50, 60, 70, 80, 90, 10, 20, 30] // or
        list22.addAll(2,list23);
        System.out.println(list22);//[40, 50, 10, 20, 30, 60, 70, 80, 90, 10, 20, 30]

        list23.addAll(Arrays.asList(40,30,20,49));
        System.out.println(list23);//[10, 20, 30, 40, 30, 20, 49]

        //removeall

        ArrayList<Integer>listGod=new ArrayList<>();
        listGod.addAll((Arrays.asList(40,30,20,49,30,50,49,45)));
        listGod.removeAll(Arrays.asList(30,49));//ikilide olur teklide cokluda
        System.out.println(listGod);//[40, 20, 50, 45]



        //retainALL
        ArrayList<Integer>listZeus=new ArrayList<>();


        listZeus.addAll((Arrays.asList(10,40,30,20,49,30,50,49,45)));

        System.out.println(listZeus);//[40, 30, 20, 49, 30, 50, 49, 45]

        listZeus.retainAll(Arrays.asList(10,20));
        System.out.println(listZeus);//[10, 20]






















    }
}
