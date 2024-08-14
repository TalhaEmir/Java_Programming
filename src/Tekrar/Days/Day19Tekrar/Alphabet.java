package Tekrar.Days.Day19Tekrar;
import java.util.Arrays;

public class Alphabet {
/*3. Create a char array and store all the alphabet letters in ascending order*/
    public static void main(String[] args) {

        char[]ascending=new char[26];
        char[]descending=new char[26];

        for (int i = 0, j='A', k='z'; i < ascending.length; i++, j++) {
            ascending[i]=(char)j;


        }
        System.out.println(Arrays.toString(ascending));

    }
}
