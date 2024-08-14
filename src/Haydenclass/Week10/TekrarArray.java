package Haydenclass.Week10;
import java.util.*;

public class TekrarArray {

    public static void main(String[] args) {
        int [] numbers= new int[5];//numbers =[0, 0, 0, 0, 0]// byte short int long

        System.out.println("numbers ="+ Arrays.toString(numbers));

        String[]names=new String[3];
        System.out.println("names =" + Arrays.toString(names));//names =[null, null, null]
        char []characters= new char[3];
        System.out.println("characters =" + Arrays.toString(characters));//names =[ ,  ,  ]

        String [] values={"APLLE","bANANA0", "Cherry"};

        System.out.println(values[2]);//Cherry

        String []abc;
        abc= new String[8];// there are just null values
// POOL JUST FOR STRINGS
        // HEAP FOR NEW STRINGS
        abc[0]="A";
        abc[1]="B";
        abc[2]="C";
        abc[3]="D";
        abc[4]="E";
        abc[5]="F";
        abc[6]="G";
        abc[7]="E";

    int [][] nums={{1,2,3},{4,5,6}, {7,8,9}};

    System.out.println(nums[1][1]);//5

        int[]num1,num2,num3;
        int number1,number2[],number3;

        String name="Talha";

       char [] nameTalha=name.toCharArray();

        System.out.println(name);//Talha
        System.out.println( Arrays.toString(nameTalha));//[T, a, l, h, a]







    }
}
