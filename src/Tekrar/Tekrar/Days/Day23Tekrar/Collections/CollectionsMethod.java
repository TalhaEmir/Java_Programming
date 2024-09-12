package Tekrar.Tekrar.Days.Day23Tekrar.Collections;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethod {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,4,5,5,6,6,7,7,8,8,8,8,9,99));

        Collections.sort(list);

        Collections.max(list);
        Collections.min(list);
        Collections.reverse(list);
        Collections.swap(list,1,5);
    }
}
