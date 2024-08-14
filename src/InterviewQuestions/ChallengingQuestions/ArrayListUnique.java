package InterviewQuestions.ChallengingQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListUnique {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6));
        for (Integer each : list) {
            int count = 0;
            for (Integer element : list) {
                if(each==element){
                    count++;
                }
            }
            if(count==1){
                System.out.println(each + " is first unique element");
                break;
            }
        }


    }

}
/*
Write a program that can return the first unique elements from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

			output:
				2
 */


