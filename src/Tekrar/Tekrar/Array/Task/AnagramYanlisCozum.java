package Tekrar.Tekrar.Array.Task;

import java.util.Arrays;

public class AnagramYanlisCozum {

    public static void main(String[] args) {
        /*Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

        Ex: str1 = "heart"
        str2 = "earth"
*/

        String str="heart";

        String str2="ecrth";

        char []str1=str.toCharArray();

        Arrays.sort(str1);

        char []str3=str2.toCharArray();

        Arrays.sort(str3);

       String result="";

        for(int i=0, j=0 ; str1.length>i; i++, j++ ){

            if(str3[j]==(str1[i])){
                result="True";
            }else{
                result="false";
            }

        }

        System.out.println(result);



    }
}
