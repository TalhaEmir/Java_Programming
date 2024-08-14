package Haydenclass.week07;

public class unique {

    public static void main(String[] args) {

        String str="aabccd";


// = a2b3c2d1

        String unique="";

        for(int i=0;i<str.length();i++){ // i= index number of str
            char each= str.charAt(i);
            //first loop a

            // 1.a yi bulur // index 0     //index 1- its index of    //en son a yi alir. bu olmaz ise ters taraftan baslayan ilk ayi bulur
            if(str.indexOf(each)== str.lastIndexOf(each)){
                unique=unique+each; // suan unique a


            }


        }




        System.out.println(unique);














    }



/* package name: day17_customClass

    Warmup Tasks:
            1. Write a program that can find the unique characters from a String
    Ex:
    str = "aabcccd"

    output:
    bd
*/








}









