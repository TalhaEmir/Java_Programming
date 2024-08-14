package week09.day23.Collections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsSwapMethod {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(10,20,30,40,50));
        System.out.println(list);
        Collections.swap(list,0,1);
        System.out.println(list);//[20, 10, 30, 40, 50]
        Collections.swap(list,4,1);
        System.out.println(list);//[20, 50, 30, 40, 10]


    }
}
