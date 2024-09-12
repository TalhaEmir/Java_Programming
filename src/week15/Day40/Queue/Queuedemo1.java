package week15.Day40.Queue;

import java.util.*;

public class Queuedemo1 {

    public static void main(String[] args) {

        Queue<Integer> queue1= new PriorityQueue<>();// order is random// does not accept null// fifo

        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
        queue1.addAll(Arrays.asList(10,200,300,40,90));
       // queue1.addAll(Arrays.asList(null,null,null));NullPointerException


        System.out.println(queue1);



        int num1= queue1.poll();//[10, 40, 10, 90, 40, 200, 40, 300, 200, 90, 90, 300, 300, 200]// fifo
        queue1.poll();
        queue1.poll();


        System.out.println("========================================================");


        System.out.println(queue1);//10, 40, 10, 90, 40, 200, 40, 300, 200, 90, 90, 300, 300, 200]
        System.out.println(num1);//10


        System.out.println("===================ArrayDeque==============================");

        Queue<Integer> queue2= new ArrayDeque<>();//insertionorder/ there is a order regular first and last // duplicates

        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));
        queue2.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println(queue2);//[10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90, 10, 200, 300, 40, 90]


        System.out.println("================poll ArrayDeque==============================");
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();
       queue2.poll();

        System.out.println(queue2);

        System.out.println("========================================================");

        Queue<Integer> queue3= new LinkedList<>();//null is okey

        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(10,200,300,40,90));
        queue3.addAll(Arrays.asList(null,null,null));

        System.out.println( queue3);//[10, 200, 300, 40, 90, 10, 200, 300, 40, 90]


        queue3.poll();//[200, 300, 40, 90, 10, 200, 300, 40, 90]


        System.out.println( queue3);//[200, 300, 40, 90, 10, 200, 300, 40, 90]

        System.out.println( ((LinkedList)queue3).get(4));

        //queue3 referansı Queue tipinde olduğu için, Queue arayüzünde tanımlı olmayan get metodunu doğrudan kullanamazsınız.
        // get metodu List arayüzüne aittir, bu yüzden LinkedList olarak referans alınmış olsaydı, get metodu kullanılabilirdi:
        //bunu downcastingle astik

        System.out.println("========================================================");


        List<Integer>list= new LinkedList<>();

       list.addAll(Arrays.asList(10,200,300,40,90));

        System.out.println( list.get(1));

        //list.poll(); yapamyiyourz cunku List referans type oldugu icin bu yuzden down casting yaocaz

        System.out.println(list);


        ( (LinkedList)list).poll();//FIFO

        //fifo yapiyoer olmamizin sebebu bunun Hem Priority Queue Array de Queue hem de LinkedList tarafindan paylasiliyor olmasi



        //============================================================================================\\

        System.out.println(list);


        ((Stack)list).pop(); //LIFO


        //Queue

    }
}
