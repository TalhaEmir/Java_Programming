package week15.Day40.Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableDemo {

    public static void main(String[] args) {
        List<Integer>list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));


        for(int i=0 ; i<list.size(); i++ ){
            if(list.get(i) <4 ){
                list.remove(i);
            }
        }


        System.out.println(  list);//[2, 4, 5, 6, 6, 5, 4, 2, 1, 3, 4]


      //=======================While================================\\
        List<Integer>list2= new ArrayList<>();
        list2.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4,2,2,2,7,9));


       Iterator<Integer>it=list2.iterator();


       while(it.hasNext()){
           if (it.next() < 4) {
               it.remove();
           }
       }


        System.out.println( list2);//[4, 5, 6, 6, 5, 4, 4, 7, 9]






        List<Integer>list3= new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));


        list3.removeIf(p-> p<4 );


        // we can not use any for loop to remove something






    }
}
