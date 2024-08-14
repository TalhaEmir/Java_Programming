package Arthurclass.week10;
import java.util.*;

public class UniquElements2 {
    public static void main(String[] args) {


        String [] array = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};

        //OPT1
        for (int i=0; i<array.length; i++){

            boolean isUnique =true;

            for(int j=0; j<array.length;j++){
                if ( i!= j && array[i].equals(array[j])){// birinci loop 0!=0 esit degil gecti
                    isUnique=false;
                }
            }
            if(isUnique){
                System.out.println(array[i]);
            }
        }

        //OPT2 from Vladimir
//        for (int i = 0; i < array.length; i++) {
//            int freq = 0;
//            for (int j = 0; j < array.length; j++) {
//
//                if (array[i].equals(array[j])) {
//                    freq +=1;
//                }
//            }
//            if (freq == 1) {
//                System.out.println(array[i]);
//            }
//        }
    }
}
/*

        String[] array = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};


        for (int i = 0; i < array.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < array.length; i++)
                if (!array[i].equals(array[j])) {
                    System.out.println(array[i]);
                    isUnique = false;
                }
        }

/*
        for (int i = 0; i < array.length; i++) {
            int freq = 0;
            for (int j = 0; j < array.length; j++) {

                if (array[i].equals(array[j])) {
                    freq +=1;
                }
            }
            if (freq == 1) {
                System.out.println(array[i]);
            }
        }
    }
}

*/
