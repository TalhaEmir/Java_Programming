package InterviewQuestions.ChallengingQuestions;

import java.util.Arrays;

public class RemoveExtraSpace {

    public static void main(String[] args) {

        String str = "  Hello world      I      love      Java    ";
        String[] word = str.split(" ");
        System.out.println(Arrays.toString(word));

        str = "";

        for (String each : word) {
            if(!each.isEmpty()){
                str+=each+" ";
            }
        }
        str =str.trim();
        System.out.println(str);
    }
}
/*

	1. Write a program that can remove all the extra space from string
			Ex:
				str = "  Hello world      I      love      Java    "

        	Output:
        		Hello world I love Java

	2. Write a  function that check if a string is build out of the same letters as another string. (Anagram Task)

            Ex: str1 = "heart"
            	str2 = "earth"

            output:
            	true

        		str1 = "java"
        		str2 = "python"

    		output:
    			false




 */

