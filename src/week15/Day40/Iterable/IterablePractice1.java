package week15.Day40.Iterable;

import java.util.*;

public class IterablePractice1 {

    public static void main(String[] args) {

    ArrayList<Integer>list= new ArrayList<>();
    list.addAll(Arrays.asList(20));

    Iterator<Integer>iterator= list.iterator();

    System.out.println(iterator.hasNext());// true






       System.out.println("==============Iterable While Loop================");



        List<String>names= new ArrayList<>();

        names.addAll(Arrays.asList("Ahmed", "AHmed","ahMED", "John", "Ercon", "Daniel","mustafa","Mohammed", "Ahmed"));


       Iterator<String>it=names.iterator();

        while(it.hasNext()){
        String each= it.next();
        if(each.equalsIgnoreCase("ahmed")){
            it.remove();
        }
        }

        System.out.println(names);



        System.out.println("==============Iterable While Loop================");

        List<String>names1= new ArrayList<>();

        names1.addAll(Arrays.asList("Ahmed", "AHmed","ahMED", "John", "Ercon", "Daniel","mustafa","Mohammed", "Ahmed"));


        names1.removeIf(p->p.equalsIgnoreCase("aHMED"));//[John, Ercon, Daniel, mustafa, Mohammed]

        System.out.println(names1);


        System.out.println("==============Iterable Loop==Practice==========");


        List<Integer>numbers= new ArrayList<>();
       numbers.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4,8,9,7 ));



       int n=5;



// find the largest number for example if number is 5 we gonan find 5th mximum number

        for(int i= 0 ; i< n-1; i++){
            numbers.removeIf(p-> Collections.max(numbers)==p);
        }

        int maximum=Collections.max(numbers);

        System.out.println(maximum);

    }
}
