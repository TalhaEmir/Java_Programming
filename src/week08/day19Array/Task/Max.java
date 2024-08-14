package week08.day19Array.Task;
import java.util.Arrays;

public class Max {

    public static void main(String[] args) {

      int []numbers={100,20,500,40,-10,30};

      int max = numbers[0];// assume that first elemtnt is the maximum number


      for(int i=1;i<=numbers.length-1;i++){//1 ,2,3,4,5,5
          if(numbers[i]>max){ // compares the element of current maxiimuum number
              max = numbers[i];
             // replace th ecurrent maximum number
          }
      }

      System.out.println(max);

        // i= 1,2,3,4,5 we are exclude index 1 20 index 2 500

    }
}
