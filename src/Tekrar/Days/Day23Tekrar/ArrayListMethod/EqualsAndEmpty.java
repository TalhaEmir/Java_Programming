package Tekrar.Days.Day23Tekrar.ArrayListMethod;
import java.util.ArrayList;
public class EqualsAndEmpty {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 =list1;

        System.out.println(list1==list2);//true
        list1.add("10");

        System.out.println(list1);
        System.out.println(list2);

        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();
        list1.add("10");
        list2.add("10");
        System.out.println(l1==l2);//false
        System.out.println(l1.equals(l2));//true

        System.out.println(l1==l2);//false they have same element but they are not equal
        System.out.println(l1.equals(l2));//true same location same order same eleement// comparte elements just indexes


    }
}
