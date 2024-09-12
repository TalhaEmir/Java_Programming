package week15.Week15Genel.Tasks;

import java.util.*;

public class CommonElements {

    public static void main(String[] args) {



        Set<Integer> list1= new LinkedHashSet<>(Arrays.asList(10, 8, 11, 20, 5, 0));
        Set<Integer> list2= new LinkedHashSet<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));
        Set<Integer> list3= new LinkedHashSet<>();


        for(Integer eachList1: list1){
            for(Integer eachList2:list2 ){
                if(eachList1==eachList2){
                    list3.add(eachList1);
                }
            }
        }


        System.out.println( list3);
        Set<Integer> nums1 = new HashSet<>(Arrays.asList(10, 8, 11, 20, 5, 0));
        Set<Integer> nums2 = new HashSet<>(Arrays.asList(30, 0, 20, 40, 50, 10, 60));
        Set<Integer> common = new TreeSet<>();

        for(int each : nums1){
            if(nums2.contains(each)){
                common.add(each);
            }
        }

        System.out.println(common);

    }

    }

