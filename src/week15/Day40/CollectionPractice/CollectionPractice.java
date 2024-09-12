package week15.Day40.CollectionPractice;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        Collection<Integer> collection= new ArrayList<>();

        collection.add(100);

        collection.addAll(Arrays.asList(100,200,100,200,300,400,500,600,700));

        System.out.println(collection.add(100));


       // System.out.println(collection.get(2));


       System.out.println(((ArrayList) collection).get(2));// down casting
       //System.out.println(((Stack) collection).pop(2));// wroong because class cast exception

        // cunku collection ArrayListi reference ediyor

        System.out.println("========================================================================");

        Collection<Integer>collection2= new HashSet<>();



        collection2.addAll(Arrays.asList(100,200,100,200,300,400,500,600,700,100,100));


        System.out.println(collection2);
        //System.out.println(((ArrayList)collection2) .get(5)); wrong cast exception

        System.out.println(new ArrayList<>(collection2) .get(4));

        List<Integer>l= new ArrayList<>(collection2);




    }
}
