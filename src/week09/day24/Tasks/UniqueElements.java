package week09.day24.Tasks;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
public class UniqueElements {

    public static void main(String[] args) {
/*Create a class called UniqueElements and write a program with the following specifications:
   9.1 Given an ArrayList, display the unique elements without using any loops.

			Example:
				list = [1, 1, 2, 3, 3, 4, 5, 5]

			output:
				[2, 4]
*/

        List<Integer> list= new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));

        list.removeIf(p->Collections.frequency(list,p)>1);



    }
}
