package Tekrar.Days.Day23Tekrar.ArrayListMethod;

import java.util.ArrayList;

public class Reverse {

    public static void main(String[] args){

        ArrayList<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        for(int i=list.size()-1; i>=0 ; i--){//5040302010

            System.out.print(list.get(i)+" ");



        }



    }
}
