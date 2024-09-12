package week15.Day41.MapClasses;

import java.util.*;

public class ArrayPractice {

    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();

        list1.addAll(Arrays.asList(1,2,3,4,5,6));



        List<Integer>list2=new ArrayList<>();//

        list2.addAll(Arrays.asList(1,2,3,4,5,6));



        List<Integer>list3=new ArrayList<>();// generic sor bunu

        list3.addAll(Arrays.asList(1,2,3,4,5,6));



        List<Integer>[] arrayOfLists= new List[3];

        arrayOfLists[0]= list1;
        arrayOfLists[1]= list2;
        arrayOfLists[2]= list3;

        System.out.println(Arrays.toString(arrayOfLists));//[[1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 5, 6]]


        // dikkat et burada birimi Liste olan verileri Arraye koyuyoruz. Bu durumda Array zaten non primitives ve primitvesleri destekliyor

        // fakat yazdirmak istedigimizde dikkat etmemiz gereken sey ilk olarak ilk kisim array ikinci kisim list

        arrayOfLists[0].set(4,50);

        System.out.println(Arrays.toString(arrayOfLists));//[[1, 2, 3, 4, 50, 6], [1, 2, 3, 4, 5, 6], [1, 2, 3, 4, 5, 6]]



       Set<Integer>[]arrayOfSets=new Set[5];


        arrayOfSets[0]=new LinkedHashSet<>();//0
        arrayOfSets[1]=new LinkedHashSet<>();//1
        arrayOfSets [2]=new LinkedHashSet<>();//2
        arrayOfSets[3]=new LinkedHashSet<>();//3
        arrayOfSets[4]=new LinkedHashSet<>();//3
        arrayOfSets[5]=new LinkedHashSet<>();//3



        arrayOfSets[2].addAll(Arrays.asList(1,2,3,4));

        System.out.println(Arrays.toString(arrayOfSets));

    }
}
