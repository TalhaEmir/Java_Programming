package week07.day17CustomClass.WarmUpQuestions;

public class UniqueCharacters2 {


    public static void main(String[] args) {


        String str="aabcccd";

        String unique="";

        char  ch=str.charAt(0);//a 3==c example yani c unique mi unqiue sa yazdiriyor
        int frequency=0;

        // this method finds exactly same character 'a' not for the rest of caharacter

        for (int i = 0; i < str.length(); i++) { // this loop helps us to find frequency of 'a'// checks how many time the ch has
            //apperaed in str
            if (str.charAt(i)==ch) { // if the ch has apperad in the string
                frequency++; // increase the frequency by 1
            }

        }

        if (frequency==1) { // if the frequency equal to 1, characteer is unique
            unique +=ch;
        }






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