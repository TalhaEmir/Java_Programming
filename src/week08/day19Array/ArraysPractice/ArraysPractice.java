package week08.day19Array.ArraysPractice;
import java.util.Arrays;

public class ArraysPractice {

    public static void main(String[] args) {



       String[] myGroup=new String[7];
        //String[]myGroup={"Talha","Alhamra","Burak","Ceza","Denali"};
        myGroup[0]="Gulcin";
        myGroup[myGroup.length-1]="Aseel";
        myGroup[2]="Sumeye";
        myGroup[1]="Abidullah";
        myGroup[3]="Khashayar";
       System.out.println(Arrays.toString(myGroup));
       myGroup[1]="Kuzzat";
       //myGroup[5]="Muhtar";


        System.out.println("=======================");



        for (int i = myGroup.length-1; i >=0 ; i--) {
            System.out.println(myGroup[i]);// my groupun birinci elementi veya birinci indeksindeki elemet
        }
        System.out.println("=======================");












    }
}
