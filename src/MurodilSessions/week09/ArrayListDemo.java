package MurodilSessions.week09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        //Arraylist declerations:
        //1)raw type
        ArrayList list1=new ArrayList();// it is not recommended

        list1.add(123);
        list1.add("hi");
        list1.add(33.4);
        list1.add('j');

        System.out.println("lisrt1=" + list1);

        //2) specify data type.recommended
        ArrayList<Integer>list2=new ArrayList<>();
        ArrayList<Integer>list3=new ArrayList<>();
        list2.add(123);
        list2.add(55);
        list3.add(44);

        //3)Using list Interface.Most Common way
        List<String>strings=new ArrayList<>();
        strings.add("Java");
        strings.add("ruby");
        System.out.println("Strings=" + strings);

        //4)USING VAR FOR THE VARIABLE DATA TYPE
        var days=new ArrayList<String>();
        days.add("Monday");
        days.add("Tuesdtay");
        System.out.println("days=" + days);

        var vars=new ArrayList<Integer>();
        vars.add(123);
        vars.add(55);

        //ASSIGN VALUES:
        //declare arrayList and use add methods
        ArrayList<String>colors=new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        System.out.println("colors=" + colors);

        //2_)Arrays.asList()- declare and assing value in same statement
        ArrayList<String>colours2=new ArrayList<>(Arrays.asList("White","grey","brown"));

        colours2.addAll(Arrays.asList("pink","blue"));
        System.out.println("colours2=" + colours2);

        //3)List.of()declare and assign non modifiable arraylist
        List<String>topics= List.of("Java","Ruby");
        //topics.add("playwirght");
        System.out.println("topics=" + topics);

        //4)Array.asList()directly.Non-modifiable List

        List<String>dayslist=Arrays.asList("Monday","Wednesday");
        //dayslist.add("Friday");
        System.out.println("dayslist=" + dayslist);











    }

}
