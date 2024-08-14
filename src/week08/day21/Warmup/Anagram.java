package week08.day21.Warmup;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {


       /* 2. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

        Ex: str1 = "heart"
        str2 = "earth"

        output:
        true

        str1 = "java"
        str2 = "python"

        output:
        false


        listen  sildent
*/
       String str1="heart";// aascii "aehtr"
       String str2="earth";//"aehtr"


      // this is another way String[] a1=str1.split("");// stringi ayirdi ve bir array haline getirdi stringin ayrilmis hali

       char[]a1=str1.toCharArray();// char yapacaksan char cagircan// baska bir yolu
        char[]a2=str2.toCharArray();

        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        Arrays.sort(a1);
        Arrays.sort(a2);
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));

        //boolean isEnagram=a1==a2;

        boolean isEnagram=Arrays.equals(a1,a2);
        System.out.println(isEnagram);


        /*if(isEnagram){
            System.out.println("Equal");
        }else {
            System.out.println("Not Equal");
        }
*/



    }
}
