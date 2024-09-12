package week15.Week15Genel.Tasks;

import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {


        List<Integer> num1 = new ArrayList<>(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));


        Set<Integer> mergedList = new TreeSet<>(num1);

        System.out.println(mergedList);

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(20, 15, 10, 20, 30, 10, 20, 15, 0));
        List<Integer> unique2 = new ArrayList<>();

        for(int each : nums2){
            if(!unique2.contains(each)){
                unique2.add(each);
            }
        }

        Collections.sort(unique2);

        System.out.println(unique2);


    }
}
