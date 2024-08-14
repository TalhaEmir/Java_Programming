package week06.Day14.First1HourTASK;

public class Day14Warmup {

    public static void main(String[] args) {


        String s1=""+ true;
        String s2=""+ 'e';// "e"
        System.out.println(s2);

        combine("one","eight");
        System.out.println(combine("teddo","oddo"));
        String str3= combine("java","apple");
        System.out.println(str3);


        System.out.println("====================================");


    }


    public static String combine(String str1, String str2) {

        String result = "";

        if(str1.endsWith(""+ str2.charAt(0))) {// if the first String ends with first character of second string
            result = str1 + str2.substring(1);
        }else{
            result = str1 + str2;
        }




        return result;


        /*Task1:
        Create a method named combine that can take two string and hen add them together and returns it.
        But if the last letter of the first word and the first letter of the last letter are the same, return that character once.

        combine("one", "eight")  ==> oneight

        Task 2:
        1. create a method that can find the sum of two integer numbers
        method name: sumOf2Numbers

        2. create a method that can find the sum of three integer numbers
        method name: sumOf3Numbers

        3. create a method that can find the sum of four integer numbers
        method name: sumOf4Numbers/*


         */







    }


}
