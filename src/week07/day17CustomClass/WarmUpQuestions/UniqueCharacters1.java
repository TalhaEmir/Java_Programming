package week07.day17CustomClass.WarmUpQuestions;

public class UniqueCharacters1 {

    public static void main(String[] args) {




        String str="aabccd";


        String unique="";


        for(int i=0;i<str.length();i++){ // i= index number of str
            char each= str.charAt(i);

            if(str.indexOf(each)== str.lastIndexOf(each)){
                unique=unique+each;

            }

        }


        System.out.println(unique);







    }




}


   /* package name: day17_customClass

    Warmup Tasks:
            1. Write a program that can find the unique characters from a String
    Ex:
    str = "aabcccd"

    output:
    bd
*/




