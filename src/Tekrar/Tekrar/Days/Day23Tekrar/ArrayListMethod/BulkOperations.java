package Tekrar.Tekrar.Days.Day23Tekrar.ArrayListMethod;
import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        System.out.println("=============AsListMethod===================");

        //list2.addAll(list1); sekklinde
        //list2.addAll(0, list1);
        ArrayList<Integer>scores= new ArrayList<>();



        ArrayList<Integer>numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);numbers.add(40);
        ArrayList<Integer>list1=new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        scores.addAll(numbers);

        list1.addAll(numbers);
       // it means gonne be add adter index 1
        list1.addAll(2,numbers);
        System.out.println(list1);//[1, 2, 10, 20, 30, 40, 3, 10, 20, 30, 40]

        //list2.addAll(list1); sekklinde
        //list2.addAll(0, list1);

        //scores.addAll(75,85,90,90,90)  // should be one argument

        scores.addAll(Arrays.asList(1,2,5,6,7));
        scores.addAll(1,Arrays.asList(1,2,3,4,6));

        Integer[]nums={1,2,3,4,5,6,7,8,9};

       ArrayList<Integer>vortex=new ArrayList<>(Arrays.asList(nums));




    }
}
