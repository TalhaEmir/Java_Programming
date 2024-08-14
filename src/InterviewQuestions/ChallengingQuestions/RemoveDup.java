package InterviewQuestions.ChallengingQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDup {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6));
        ArrayList<Integer> newList = new ArrayList<>();
        for (Integer each : list) {
            if(!newList.contains(each)){
                newList.add(each);
            }
        }
        System.out.println(newList);

        //2. solution



    }
}
/*
Write a program that can remove the duplicates from an arraylist
			Ex:
				ArrayList = {1, 1, 2, 3, 3, 4, 5, 5, 6}

			output:
				{1,2,3,4,5,6}
 */

