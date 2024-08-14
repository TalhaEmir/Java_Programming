package week07.day16;

import java.util.Scanner;

public class Interview_FrequencyCharacter {

    //minutes 49

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str="acbacb";
        char ch='c';

        int count= 0;


        for (int i = 0; i < str.length(); i++) { // i:  represent index numbers of str // char At getting character// niye str length tum kelmiyei kapsayacak sekilde

            if(str.charAt(i)==ch){// if the character of the string is equal to given character, it mneans the given character has apperaed at string
                count++;
            } // str chat getting character of string and we make equal it char ch
            
        }


        System.out.println(count);
        

/* write a program that can return the frequency of a character from a string
        	Ex:
        		str = "aaabbbbccccc"
        		ch = 'c'

		     output:
		     	5
*/




    }
}
