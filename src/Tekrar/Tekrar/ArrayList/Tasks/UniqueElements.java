package Tekrar.Tekrar.ArrayList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        ArrayList<Integer>list =new ArrayList (Arrays.asList(1, 1, 2, 3, 3, 4, 5, 5, 6));

        ArrayList<Integer>unique=new ArrayList<>();

        for (Integer element : list) { // 1

            int frequency = 0;
            for (Integer each : list) {
                if(each == element){
                    frequency++;
                }
            }

            if(frequency == 1){
                System.out.println(element);
                break; // exiting the loop, in order to return the first unique element only
            }

        }
        }
    }

