package MurodilSessions.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AdFirstandLast {
    public static void main(String[] args) {

        List<Integer>l1=new ArrayList<>();
        l1.addAll(Arrays.asList(1, 11, 22));
        System.out.println(AdFirstandLast(l1));

        List<Integer>l2=new ArrayList<>();
        l2.add(4);
        l2.add(5);
        List<Integer>l3=new ArrayList<>();
        l2.add(4);
        l2.add(5);

        System.out.println(checkListEquality(l1,l2));//List are equal



    }

    public static int AdFirstandLast(List<Integer> list) {

        if(list.isEmpty()) return -0;
        int sum=list.get(0) + list.get(list.size()-1);
        return sum;
    }

    public static String checkListEquality(List<Integer> list1, List<Integer> list2) {
        if(list1.size()!=list2.size()){
            return"List are equal";
        }else{
            return "Lists are equal";
        }

        /*if(list1.size()!=list2.size()) return "Lists are not equal";{
            return"List are equal";
        }
            return "Lists are equal";
        }

        return list1.equals(list2)>"Listsareequal"?(
        */

    }



}

