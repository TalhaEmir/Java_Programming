package Tekrar.Tekrar.Days.Day23Tekrar.ArrayListMethod;
import java.util.ArrayList;
public class SetMethods {

    public static void main(String[] args) {

        //set methods completely change the target indeks not sliding or shifting

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println(list);//[1, 2, 3, 4]

        list.set(2,100);
        System.out.println(list);//[1, 2, 100, 4]


        ArrayList<String>names=new ArrayList<>();
        names.add("A");
        names.add("B");
        names.add("C");
        names.add("D");


       names.set(2,"D");
       System.out.println(names);//[A, B, D, D]





    }
}
