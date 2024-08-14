package week09.day24.Tasks;
import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {

       /* Create a class called RemoveDuplicates and write a program with the following specifications:
        8.1 Given an ArrayList of integers, remove duplicated numbers.

        Example:
        list = [1,1,2,2,3,3,4,4,5,6,7]

        Output:
				[1,2,3,4,5,6,7]*/

        List<Integer>list= new ArrayList<>(Arrays.asList(1,1,2,2,3,3,4,4,5,6,7));
        List<Integer>newList=new ArrayList<>();

        for(int i=0;i<list.size();i++){
            if(!newList.contains(list.get(i))){

                newList.add(list.get(i));
            }

        }

        System.out.println(newList);

        //another metod
        //int size = list.size();
        for (int i = 0; i < list.size(); i++) {
            if(Collections.frequency(list,i)>1){
                list.remove(list.get(i));
            }
        }
        System.out.println(list);
    }
}
