package week09.day24.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Duplicate {

    public static void main(String[] args) {
/*. Create a class called DuplicateElements and write a program with the following specifications:
   3.1 Given an ArrayList, duplicate each element in the list.

		 	Example:
                list = [1,2,3,4,5];

            output:
            	[1,2,3,4,5,1,2,3,4,5];


*/


            ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5));

            int sum=list.size();

            for(int i=0;i<sum; i++){

                list.add(list.get(i));

            }


        System.out.println(list);



    }
}
