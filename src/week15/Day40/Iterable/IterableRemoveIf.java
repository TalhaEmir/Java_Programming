package week15.Day40.Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class IterableRemoveIf {


    public static void main(String[] args) {
        List<Integer> list3= new ArrayList<>();
        list3.addAll(Arrays.asList(1,2,3,4,5,6,6,5,4,3,2,1,1,2,3,4));


        list3.removeIf(each-> each<5 );
    }
}
