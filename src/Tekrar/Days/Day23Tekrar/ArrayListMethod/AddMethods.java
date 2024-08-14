package Tekrar.Days.Day23Tekrar.ArrayListMethod;
import java.util.ArrayList;
public class AddMethods {
    public static void main(String[] args) {

        ArrayList<Integer>numbers=new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        //or

        numbers.add(1,5);// we can not make a list


        System.out.println(numbers);


        ArrayList<String>names=new ArrayList<>();

        names.add("My name is");
        names.add("Ammo");
        names.add(1,"tE aMO");
        System.out.println(names);

    }
}
