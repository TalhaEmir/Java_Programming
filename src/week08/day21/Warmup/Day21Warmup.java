package week08.day21.Warmup;

import java.util.Arrays;

public class Day21Warmup {

    public static void main(String[] args) {
        String str = " Hello   world     I love   Java    ";
       // str=str.trim();
        //System.out.println(str);

        String[]words=str.split(" ");
        System.out.println(Arrays.toString(words));
        str="";

        for (String each : words) {
          if (!each.isEmpty()){
              str +=each+" ";
          }
            
        }
        str=str.trim();
        System.out.println(str);






    }

}