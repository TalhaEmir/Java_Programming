package Tekrar.Tekrar.Array.Task;

import java.util.Arrays;

public class AnagramYanlisCozum1 {
    public static void main(String[] args) {
        String str="heart";

        String str2="earth";

        char []str1=str.toCharArray();

        Arrays.sort(str1);

        char []str3=str2.toCharArray();

        Arrays.sort(str3);

        boolean isAnagram = true;

        for (int i = 0; i < str1.length; i++) {
            if((str1.length==str3.length) && (str1[i]==str3[i])){
                System.out.println(isAnagram);
            }else{
                isAnagram=false;
                break;
            }
        }





    }
}
