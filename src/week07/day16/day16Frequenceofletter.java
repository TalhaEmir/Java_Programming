package week07.day16;

public class day16Frequenceofletter {
    /*2. write a program that can return the frequency of a character from a string
    Ex:
    str = "aaabbbbccccc"
    ch = 'c'

    output:
            5

            3.  Write a program that can return the frequency of the word java from a sentence
    Ex:
    sentence = "java JAVA jAvA JAva"

    output:
            4
*/

    public static void main(String[] args) {


        String str= "aaabbbbccccc";
        char ch = 'c';
        int repeat=0;

        for (int i = 0; i < str.length(); i++) {
           char ch1 = str.charAt(i);

           if (ch == ch1) {
               repeat ++;

           }


        }
        System.out.println(" "+repeat);




    }
}
