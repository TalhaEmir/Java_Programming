package week15.Day40.Queue;

import java.util.*;

public class QueDemo {
    public static void main(String[] args) {


        Queue<Integer>priorityQueue= new PriorityQueue<>();
        //priorityQueue.addAll(Arrays.asList(10,20,300,40,90,200,300,null)); // it doesnt accept
        priorityQueue.addAll(Arrays.asList(10,200,300,40,90,200,300));

        System.out.println("priorityQueue" + priorityQueue);//priorityQueue[10, 40, 200, 200, 90, 300, 300]


        Queue<Integer>arrayQueue= new ArrayDeque<>();
        arrayQueue.addAll(Arrays.asList(10,200,300,40,90,200,300));

        System.out.println(" arrayQueue" + arrayQueue);//  arrayQueue[10, 200, 300, 40, 90, 200, 300]


        Queue<Integer>linkedList= new LinkedList<>();
        linkedList.addAll(Arrays.asList(10,200,300,40,90,200,300,null));//   linkedList[10, 200, 300, 40, 90, 200, 300, null]



        System.out.println(" linkedList" + linkedList);
        System.out.println(" linkedList 1 " + ((LinkedList<Integer>) linkedList).get(1));// casting


        System.out.println("===================================================================");


        int n=priorityQueue.poll();
        System.out.println(priorityQueue);//[40, 90, 200, 200, 300, 300]
        System.out.println(n);//10




    }
}
