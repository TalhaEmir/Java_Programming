package Tekrar.Tekrar.Days.Day23Tekrar.ArrayListMethod;
import java.util.ArrayList;
public class RemoveMethods {

    public static void main(String[] args) {

        ArrayList<Integer>numbers = new ArrayList<>();
        //REMOVE METHODS
        //remove method string or index not both of gthem together
        //remove method remove the item also it is decreasing the number of item of variable
        //also align shift to the left
        //in addition just firs item it faced
        //  numbers.remove(Integer.valueOf(10));//[20, 30, 40, 10] anca boyle
        // list.remove("10");//[20, 30, 10]

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(10);

        System.out.println(numbers);//[10, 20, 30, 40, 10]

        numbers.remove(Integer.valueOf(10));//[20, 30, 40, 10] anca boyle

        System.out.println(numbers);

        ArrayList<String>list = new ArrayList<>();
        list.add("10");
        list.add("20");
        list.add("30");
        list.add("10");

        list.remove("10");//[20, 30, 10]


        System.out.println(list);
        // --CLEAR METHODS
        //no need to wrigh something inside

        list.clear();
        System.out.println(list);//[]
    }
}
