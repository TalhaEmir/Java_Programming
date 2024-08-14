package week08.day19Array.ArrayLiteral;

import java.util.Arrays;

public class ArrayLiteral {

    public static void main(String[] args) {

    // its only for you dont know what is the for elements are // five zero right now
       int[]num={10,20,30,40,50};// array object I created size is fixed. We can not change size of the Array
        int[] numbers= new int[5];
        int[] nums={10,20,30,40,50};

        System.out.println(numbers.length);
        System.out.println(nums.length);

        System.out.println("numbers =" + Arrays.toString(numbers));
        System.out.println("nums =" + Arrays.toString(nums));

        System.out.println("===========================");
                        //element 1     2   3               4           5       6           7
        String []days= {"Monday","Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
                        // index0      1        2            3          4         5                  6
        int n=1;
        System.out.println(days[n-1]);

        String [] month={"Jan", "Feb", "Mar", "Apr", "May", "Jun","Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println(Arrays.toString(month));

        //month= new String[12];
        //month[0]="Jan";

        for (int i = month.length - 1; i >= 0; i--) {
            System.out.println(month[i]);

        }
    }
}
