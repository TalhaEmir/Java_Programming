package Tekrar.Days.Day23Tekrar.ArrayListMethod;
import java.util.Arrays;
import java.util.ArrayList;

public class RemoveAll {

    public static void main(String[] args) {

        //removeall

        ArrayList<Integer>list22=new ArrayList<>();
        list22.add(1);
        list22.add(2);
        list22.add(1);
        list22.add(4);
        list22.add(1);
        list22.add(6);

        list22.removeAll(Arrays.asList(1));
        System.out.println(list22);//[2, 4, 6]
        //oor (Arrays.asList(30,49));//ikilide olur teklide cokluda



    }
}
