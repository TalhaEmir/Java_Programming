package week09.day23.ArraysLists;
import java.util.ArrayList;
import java.util.Arrays;

public class Day23RemoveMethods {

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,8,9,0,0,1,2,3,45,5,6));
/*

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<4){//index number is changing and swifting remember the insert.
                //why remove is not super advisable
                list.remove(i);
            }

        }
        System.out.println(list);//[2, 4, 5, 6, 7, 8, 8, 9, 0, 2, 45, 5, 6]

*/

       list.removeIf(p->p<4);
       System.out.println(list);//[4, 5, 6, 7, 8, 8, 9, 45, 5, 6]



    }
}
