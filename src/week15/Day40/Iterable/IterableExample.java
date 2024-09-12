package week15.Day40.Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IterableExample {

    public static void main(String[] args) {
        List<Integer> list= new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));


        Iterator<Integer>it=list.iterator();
        //=======================While================================\\

// iterator while loop\\\
        while(it.hasNext()){
            Integer each=it.next();
            if(each<5 ){
                it.remove();
            }

        }


        System.out.println(list);//[5, 6, 6, 5]

/// Devami var asagida \\\\


        //=======================Regular For Loop================================\\



        List<Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));

        for(Iterator<Integer>i=list3.iterator() ; i.hasNext();   ){ // fixed for loop hasNext is border no need increement such as i++
            Integer each=i.next();
            if(each<5 ){
                i.remove();
            }
        }



        System.out.println(list3);//[5, 6, 6, 5]






/*
        for(Integer each: list){ // it is using iterator but hidden
            if(each<4 ){
                list.remove(each);// it has to reach iterable but it is on the Collection // each is object in here
            }
        }
*/
    /*   for(int i= 0 ; i < list.size(); i++){
            if(list.get(i)<5 ){
                list.remove(i);
            }
        }
*/
        // expilicitly using iterator method


    }
}
