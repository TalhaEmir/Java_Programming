package Arthurclass.Oscar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class OscarHiAbc {

    public static void main(String[] args) {
        /*endOther("Hiabc", "abc") → true
endOther("AbC", "HiaBc") → true
endOther("abc", "abXabc") → true
*/
ArrayList<Integer>numbers=new ArrayList<>();
numbers.addAll(Arrays.asList(7,7,3,4,8,9));
System.out.println(findSecondMax(numbers));

Collections.sort(numbers);


    }

    public static boolean endOther(String s1, String s2) {
        // s1=s1.toLowerCase();
        //s2=s2.toLowerCase();
        //boolean result=s1.endsWith(s2) || s2.endsWith(s1);

        return s1.toLowerCase().endsWith(s2) || s2.toLowerCase().endsWith(s1);

    }

    public static boolean isEveryWhere(int[] arr, int val) {
        for (int i = 0; i < arr.length; i++) {
            int p1 = arr[i];
            int p2 = arr[i + 1];

            if (p1 != val && p2 != val) {
                return false;
            }

        }
        return true;
    }

    public static int findSecondMax(ArrayList<Integer>numbers){

        int maxNumber=numbers.get(0);
        int secondMaxNumber= numbers.get(0);
        for(Integer number: numbers){
            if(number> maxNumber){
              // when we find new max number we need to transfer the previous one to second max
                secondMaxNumber= maxNumber;
                maxNumber=number;
// we need to check if the next number in the list falls between
            }else if(number > secondMaxNumber && number< maxNumber){

            }
        }
return secondMaxNumber;
    }
}