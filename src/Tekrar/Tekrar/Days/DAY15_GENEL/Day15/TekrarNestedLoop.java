package Tekrar.Tekrar.Days.DAY15_GENEL.Day15;

public class TekrarNestedLoop {
    public static void main(String[] args) {
        String str="aaabbccccddeeeeeff";
        String result="";

        for(int j=0;j<str.length();j++){
            // 1 - a
            char ch= str.charAt(j); //   1- t     2- a    3- l    4- h
            int count=0;
            for(int k=0;k<str.length();k++){
                if(ch==str.charAt(k)){
                     count ++;
                }
            }


        }

    }

}