package Tekrar.Tekrar.ArrayList.TekrarTASK;

import java.util.ArrayList;
import java.util.Arrays;

public class MaximumNumber {

    public static void main(String[] args) {
        ArrayList<Integer>list= new ArrayList<>(Arrays.asList(1,2,3,4,5));
        int max=list.get(0);

        for(int each: list){
            if(each>max){
                max= each;
            }
        }


        System.out.println(max);
    }
}
