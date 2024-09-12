package Tekrar.Tekrar.ArrayList.Collections;
import java.util.Collections;
import java.util.ArrayList;
import java.util.Arrays;
public class ArraysCollectionsSortMethod {


    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,10,30,30,30,0,20,20,20, 2, 3, 4, 5,10));
        System.out.println(list);//[1, 10, 30, 30, 30, 0, 20, 20, 20, 2, 3, 4, 5, 10]

        Collections.sort(list);

        System.out.println(list);//[0, 1, 2, 3, 4, 5, 10, 10, 20, 20, 20, 30, 30, 30]

    }
}
