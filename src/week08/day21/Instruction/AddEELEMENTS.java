package week08.day21.Instruction;

import week10.Day27.Utilities.ArraysUtility;

import java.util.Arrays;

public class AddEELEMENTS {
    public static void main(String[] args) {


        int[]array={10,20,30,40,50,60,70,80};
        int element=90;

        // you can not add like basic but

        //but
        int [] new_array= Arrays.copyOf(array,array.length+1);
        new_array[new_array.length-1]=element;// direk veriyor 6 yi burada
        System.out.println(Arrays.toString(new_array));

        //{1,2,3,4,5,6}

        int[]numbers={100,90,80,70,60};
        numbers=ArraysUtility.addElement(numbers,50);

        double[]nums={1.5,2.5,3.5,4.5};

        nums=ArraysUtility.addElement(nums,5.5);
        System.out.println(Arrays.toString(nums));
        nums=ArraysUtility.addElement(nums,6.5);
        System.out.println(Arrays.toString(nums));
        nums=ArraysUtility.addElement(nums,7.5);


        System.out.println("==================");
        String[]students={"Yasin","Sumeye","Ermek"};
        students=ArraysUtility.addElement(students,"Talha");
        System.out.println(Arrays.toString(students));
        students=ArraysUtility.addElement(students,"Muta");






    }
}
