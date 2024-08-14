package Arthurclass.week10;
import java.util.*;

public class UniqueElements {
    public static void main(String[] args) {

        String[] array = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};

        //System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        // System.out.println(Arrays.toString(array));  [C#, Java, Python, Python, Ruby, Ruby]
        //  0     1     2       3       4     5
        for (int i = 0; i < array.length; i++) {
            if (i == 0 && !array[i].equals(array[i + 1]) || !array[i].equals(array[i - 1]) && !array[i].equals(array[i + 1])) {
                System.out.println(array[i]);

                /*for(int i=0; i<array.length; i++){
 if(i==0 && !array[i].equals(array[i+1])|| !array[i].equals(array[i-1]) && !array[i].equals(array[i+1]))
 System.out.println(array[i]);



        for (int i=0; i< array.length; i++){
            if( i==0 && !array[i].equals(array[i+1]) || !array[i].equals(array[i-1]) && !array[i].equals(array[i+1]) ){
                System.out.println(array[i]);
            }

            /*
            }
        }

    }
}
/*
        String[]array={"Java", "Python", "Python","Ruby", "Ruby", "C#"};

        System.out.println("array ="+ Arrays.toString(array));
        //Arrays.sort(array);// or

        //System.out.println("array ="+ Arrays.toString(array));//C#, Java, Python, Python, Ruby, Ruby
//                                                               0    1    2       3         4    5
        System.out.println("===============================");


        }
 }

        }
// it is wrong because we dont have indeks 6






    /*1. Write a program that identifies the unique elements in an array of Strings.
		   Example:
		      Input array: {"Java", "Python", "Python", "Ruby", "Ruby", "C#"}

		   Output:
		      Java
		      C#
}
*/


            }

        }

    }

}