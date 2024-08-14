package week09.day23.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsMinMax {
    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8,9,0,0,1,2,3,45,5,6,0,-5,300));

        Collections.min(list);
        Collections.max(list);
        int min= Collections.min(list);
        int max= Collections.max(list);

        System.out.println("min="+min  );
        System.out.println("max="+max);

    }
}
