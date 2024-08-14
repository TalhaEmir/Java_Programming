package week08.day21.Task;

import java.util.Arrays;

public class ReverseArray2 {

    public static void main(String[] args) {

        int[]nums={1,2,3,4,5,6,7,8,9};
        int[]reverse=new int[nums.length];

        for (int i = 0, j=nums.length-1; i <nums.length ; i++, j--) {
            reverse[i]=nums[j];
        }

        //i is for index->= from thebeginning
        //j is for value -> from the end

        System.out.println(Arrays.toString(reverse));


    }
}
