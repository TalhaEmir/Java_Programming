package week15.day39.ListDemo;

import java.util.*;

public class ListDemo {

    public static void main(String[] args) {

        List<Integer>arrayList1= new ArrayList<>();


        List<Integer>linkedList1= new LinkedList<>();

        ArrayList<Integer>arrayList= new ArrayList<>();//Array Based Class==> get() is faster

        // polimorfizm ArrayList faster th
        // retrieveing element faster



        arrayList.add(100);
        arrayList.add(200);
        arrayList.add(300);

        arrayList.remove(0);

        arrayList.get(0);


       LinkedList<Integer>linkedList= new LinkedList<>();////node based class (doubly linked List);
        // add() , remove(), remove all(), addAll() , remOveIf, RETAINaLL()

        //adding oer deleting element faster


        // polimorfizm // it is not using Array implicitly mean it is not fast as ArrayList it is using Node base class

        // also it is not allowed to call random access as ArrayList
        // it going back and forward why it is slower it is not going direclty
        linkedList.add(100);
        linkedList.add(200);
        linkedList.add(300);

        linkedList.remove(0);

        linkedList.get(0);


System.out.println("====================Vector==============");

Vector<Integer> vector= new Vector<>();

vector.add(100);
vector.add(200);
vector.add(300);


        System.out.println("======Stack =====================");


        Stack <Integer>stack= new Stack<>();
        stack.add(100);
        stack.add(200);
        stack.add(300);

        System.out.println(stack);


        int lastElement= stack.pop();

        System.out.println(lastElement);

        System.out.println(stack);

        int secondLastStackElement=stack.pop();


        System.out.println(secondLastStackElement);








    }


}
