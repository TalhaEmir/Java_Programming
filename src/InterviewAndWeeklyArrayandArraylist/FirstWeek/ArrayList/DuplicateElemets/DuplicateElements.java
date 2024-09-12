package InterviewAndWeeklyArrayandArraylist.FirstWeek.ArrayList.DuplicateElemets;

import java.util.ArrayList;
import java.util.Arrays;

public class DuplicateElements {

    public static void main(String[] args) {
        ArrayList<Integer> list= new ArrayList<>(Arrays.asList(1,2,3,4,5));

       int length= list.size();


        for(int i= 0 ; i< length ; i++){
         list.add(list.get(i));

        }

        System.out.println(list);//[1, 2, 3, 4, 5, 1, 2, 3, 4, 5]

        // option 2

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        list2.addAll(list2);

        System.out.println(list2);





    }
}
