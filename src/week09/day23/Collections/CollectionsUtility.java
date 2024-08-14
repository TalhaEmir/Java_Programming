package week09.day23.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CollectionsUtility {
    public static void main(String[] args) {
        System.out.println("===========Min and Max======================");

        // it has to be Collections

        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 3, 4, 5, 6, 7, 7, 8, 9, 9, 0));

        Collections.max(list);// you hvate pass collection type
        int max = Collections.max(list);// unboxing
        int min = Collections.min(list);//unboxing
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

//Max: 9
//Min: 0

        System.out.println("========Sort=============");

       ArrayList<String>names=new ArrayList<>(Arrays.asList("Potato","Milk","Stwayberry"));
       Collections.sort(names);
        System.out.println(names);//[Milk, Potato, Stwayberry]


        System.out.println("========Reverse=============");


        Collections.reverse(names);
        System.out.println(names);//[Stwayberry, Potato, Milk]


        System.out.println("========Swap=============");


        //Swaps the two elements at the specified element in the list
        ArrayList<String>students=new ArrayList<>(Arrays.asList("Gadir","Hasan","Abidullah","Bilal"));
        System.out.println(students);//[Gadir, Hasan, Abidullah, Bilal]

        Collections.swap(students,0,1);// first variable then first index then other index

        //or


        System.out.println(students);//[Hasan, Gadir, Abidullah, Bilal]


        System.out.println("=================");

        Collections.swap(students,1,students.size()-1);
        System.out.println(students);//[Hasan, Bilal, Abidullah, Gadir]
















    }
}
