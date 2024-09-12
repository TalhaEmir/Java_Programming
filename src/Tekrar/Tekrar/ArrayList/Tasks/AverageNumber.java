package Tekrar.Tekrar.ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class AverageNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list =new ArrayList (Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        int totalNumber=0;

        int average=0;

        for(int i=0; i<list.size() ; i++){
            totalNumber+=list.get(i);
        }

        average=totalNumber/list.size();

        System.out.println(average);
    }
}
