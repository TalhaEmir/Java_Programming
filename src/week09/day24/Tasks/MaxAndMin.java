package week09.day24.Tasks;
import java.util.*;

public class MaxAndMin {

    public static void main(String[] args) {
/*
7. Create a class called MaximumAndMinimumNumbers and write a program with the following specifications:
   7.1 Given an ArrayList of integers, find and display the maximum and minimum numbers without using any sorting.

			Example:
				list = [1,2,3,4,5];

			output:
			    Maximum number is 5
			    Minimum number is 1
*/
        List<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5));

        //int maximumNumber=list.get(0);
        //int maximumNumber=list.get(0);
        int minimumNumber=Integer.MIN_VALUE;
      int maximumNumber=Integer.MAX_VALUE;

      for(int each:list){
          if(each>maximumNumber){
              maximumNumber=each;
          }
          if(each>minimumNumber){
              minimumNumber=each;
          }
      }


    }
}
