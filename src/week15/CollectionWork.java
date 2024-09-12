package week15;

import java.util.*;

public class CollectionWork {

    public static void main(String[] args) {
        Collection<Integer> collection= new ArrayList<>();

        collection.add(100);

        collection.addAll(Arrays.asList(100,200,100,200,300,400,500,600,700));



        System.out.println("=====================1 DownCasting======================================");
        // System.out.println(collection.get(2)); kullanilamaz cunku sadece get metodu yok casting lazim

        System.out.println(((ArrayList) collection).get(2));// down casting

//System.out.println(((Stack) collection).pop(2));// wroong because class cast exception

        System.out.println("=====================2 Construction======================================");


        Collection<Integer>collection2= new HashSet<>();


        collection2.addAll(Arrays.asList(100,200,100,200,300,400,500,600,700,100,100));


        System.out.println(new ArrayList<>(collection2) .get(4));


        //System.out.println(((ArrayList)collection2) .get(5)); wrong cast exception

        System.out.println("=====================3 Convert======================================");


        List<Integer>l= new ArrayList<>(collection2);



        //=======================Conversion from Set to ArrayList=========================================\\


        String[] words= {"Java","Java","Java","Java","Java","Phyton","Phyton","C#","C++","Ruby", "C#","C#"};


        Set<String> result= new LinkedHashSet<>();

        result.addAll(Arrays.asList(words));

        System.out.println(result);//[Java, Phyton, C#, C++, Ruby]



    }
}
