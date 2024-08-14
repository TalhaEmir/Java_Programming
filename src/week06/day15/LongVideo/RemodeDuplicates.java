package week06.day15.LongVideo;

public class RemodeDuplicates {

    public static void main(String[] args) {

/* Write a program that can remove the duplicated characters from the a string
//
//				Ex:
//					str = "aabbbcccc"
//
//					output:abc

*/
        
        
        String str="xzcasfavagaav";
        
        String result=""; //"aa"


        for (int i = 0; i < str.length(); i++) { // i : index numbers of str we didnt put any lenth-1 because <
            //< son karakteri almuyor kucuk esit degil bu arada bu formul tum karakterleri aliyor yazdiriyor asagidaki char methoduyla
           char each= str.charAt(i); // each character of the Srtring str
            if(!result.contains("" + each)){ // if the string result does not contain the character if string str yet
                result += each; // result = result + each // then we will add the character to string esult
            }
        }
        System.out.println(result);// if the character is not contained yet in the new string, then we will to the new string
        
        
        
    }



}
