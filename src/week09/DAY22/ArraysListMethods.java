package week09.DAY22;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class ArraysListMethods {

    public static void main(String[] args) {

        ArrayList<Integer>list=new ArrayList<>();


        list.add(10);//0 // it is primitive but Integer bunu koyduk wrapper ve cevirdi primitive int Wrapper ile Integere cevrildi
        list.add(20);//1// you can add one by one
        list.add(30);//2
        list.add(10);//3
        //list.add(5.5);compiler because it is double
        System.out.println(list);//[10, 20, 30]
        // it can duplicated elements

        System.out.println(list.get(0));// value seem int return int because Integer
        // for inserting number with ondex number

        list.add(1,15);//1
        list.add(2,25);
        System.out.println(list);//[10, 15, 25, 20, 30, 10]// it sliding into right

        ArrayList<String>studentList=new ArrayList<>();//new ArrayList<>(); it didnt change any other objects its has own memory
        studentList.add("Mogammad");
        studentList.add("Abdurrasul");
        studentList.add("Abidullah");
        studentList.add("Tatiana");
        System.out.println(studentList);
        System.out.println(studentList.size());//4
        System.out.println(studentList.get(0));//value seem String return int because String
        System.out.println(studentList.get(3));//Tatiana
        String firstStudent=studentList.get(0);// buradaki 0.indeksteki element firststidentin degeri olacak
        System.out.println(firstStudent);//Mogammad
        studentList.get(studentList.size()-1);// bu metod studentListtin son indeksindeki karakyer icin
        //neden bu kadar yazdik cunku ornegin bilmiyorsak
        String lastStudent=studentList.get(studentList.size()-1); // burada son ogrenciyi buraya yerlestirdik











    }
}
