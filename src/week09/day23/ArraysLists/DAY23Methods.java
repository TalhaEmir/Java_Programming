package week09.day23.ArraysLists;

import java.util.ArrayList;
import java.util.Arrays;

public class DAY23Methods {

    public static void main(String[] args) {

        //add and size methods
        // add method increase the size and make slide the number right

        ArrayList<String> list = new ArrayList<String>();

        list.add("Cydeo");
        list.add("Java");
        list.add("Sdet");
        list.add(1,"Phyton");
        int totalElements=list.size();
        System.out.println("Total number of elements: "+totalElements);


        //getmethods// yalnizca indeks


        System.out.println(list.get(2));
        String thirdElement=list.get(2);
        System.out.println(thirdElement);
        System.out.println(list);


        //set methods// //variables.set(int index, E element) {
        System.out.println("==========SetMethod===============");
        //variables.set(int index, E element) {


        int[]array={1,2,3,4,5,6,7,8,9};
        array[0]=100;// updating value of array
        System.out.println(Arrays.toString(array));

        System.out.println("==========SetMethod example 1===============");
        ArrayList<String>groceriesList =new ArrayList<>();
        groceriesList.add("Egg");
        groceriesList.add("Cucumber");
        groceriesList.add("Apples");
        groceriesList.add("Scissors");

        System.out.println(groceriesList);//[Egg, Cucumber, Apples, Scissors]
        groceriesList.set(2,"Orange");
        System.out.println(groceriesList);//[Egg, Cucumber, Orange, Scissors] degistirmiyor insert gibi veya add gibib
        //first argument index second argument item
        //set(int index, E element) {


        System.out.println("==========Example 2 ===============");
        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        numbers.set((numbers.size()-1), 60);
        numbers.set((numbers.size()-1), 60);
        numbers.set(2, 60);
        System.out.println(numbers);

        System.out.println("==========REMOVE METHODS ===============");
        //REMOVE METHODS
        //remove method string or index not both of gthem together
        //remove method remove the item also it is decreasing the number of item of variable
        //also align shift to the left
        ArrayList<Integer>num=new ArrayList<>();
        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        num.add(50);
        num.set((numbers.size()-1), 60);
        num.set((numbers.size()-1), 60);
        num.set(2, 60);
        System.out.println(numbers);
        num.remove(2); // or
        // ya da int
        num.remove(Integer.valueOf(10));// bu sayede wrapper olarak alirsin autoboxing, 30 u pbject olarak aldi
        // burada objecti aldik

        boolean r1=num.remove(Integer.valueOf(20));
        System.out.println(r1);//true



        ArrayList<String> nameList = new ArrayList<String>();

        nameList.add("Java");
        nameList.add("C**");
        nameList.add("Phyton");
        nameList.add("Java");
        nameList.add("Ruby");
        nameList.add("C+");
        nameList.add("java");
        //System.out.println(nameList.remove(3));//[Java, C**, Phyton, Ruby, C+, java]
        System.out.println(nameList);
        nameList.remove("Java");// first matching object
        System.out.println(nameList);//[C**, Phyton, Java, Ruby, C+, java]
       nameList.remove("C+"); // or
        nameList.remove(2);// indeks methodla remove etme
        System.out.println(nameList);//[C**, Phyton, Java, Ruby, java]

        System.out.println("==========--CLEAR METHODS ===============");
        // --CLEAR METHODS

        nameList.clear();
        System.out.println(nameList);//[]

        System.out.println("==========index of and lastindex of METHODS ===============");
        //index of and lastindex of
        //should be String or character you can not put directly number
        //always element from right to the left
        // it is return number of element


        ArrayList<String>namesit=new ArrayList<>();

        namesit.add("Java");//0
        namesit.add("C**");//1
        namesit.add("Phyton");//2
        namesit.add("Java");
        namesit.add("Ruby");
        namesit.add("C+");
        namesit.add("java");


        System.out.println(namesit.indexOf("Java"));//0
        System.out.println(namesit.lastIndexOf("java"));//6

        /*System.out.println(list.indexOf("Phyton"));
        int index1=namesit.indexOf("Phyton");
        System.out.println(index1);//2
        int index2=namesit.lastIndexOf("Java");
        System.out.println(index2);//3*/

        System.out.println("==================contains method=================");
        //contains method
        //always return String




        ArrayList<String> nome = new ArrayList<String>();

        nome.add("Java");
        nome.add("C**");
        nome.add("Phyton");
        nome.add("Java");
        nome.add("Ruby");
        nome.add("C+");
        nome.add("java");

        boolean hasJava= nome.contains("Java");//boolean tru or false gibi

        boolean hasSwift= nome.contains("Swift");
        boolean hasjava= nome.contains("java");

        System.out.println("hasJava"+ hasJava);//hasJavatrue
        System.out.println("hasSwift"+ hasSwift);//hasSwiftfalse
        System.out.println("hasJava"+ hasJava);

        //equals --isempty

        ArrayList<Integer>list1=new ArrayList<>();

        ArrayList<Integer>list2=list1;

        list1.add(10);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1==list2);//true

        ArrayList<Integer>l1=new ArrayList<>();
        ArrayList<Integer>l2=new ArrayList<>();

        l1.add(10);
        l2.add(10);
        System.out.println(l1);//10
        System.out.println(l2);//empty

        System.out.println(l1==l2);//false they have same eleement but they are not equal
        System.out.println(l1.equals(l2));//true same location same order same eleement// comparte elements just indexes

        ArrayList<Integer>n1=new ArrayList<>();
        n1.add(10);
        n1.add(20);
        n1.add(30);
        System.out.println(n1);
        ArrayList<Integer>n2=new ArrayList<>();
        n2.add(30);
        n2.add(20);
        n2.add(10);

        System.out.println("n1="+ n1);
        System.out.println("n2="+ n2);


        System.out.println(n1.equals(n2));// false

        // if the elements order is different  not euqal






        ArrayList<String> cognome = new ArrayList<String>();

        cognome.add("Java");
        cognome.add("C**");
        cognome.add("Phyton");
        
        ArrayList<String> ilCognome = new ArrayList<String>();

        ilCognome.add("Java");
        ilCognome.add("C**");
        ilCognome.add("Phyton");

        System.out.println("cognome"+ cognome);
        System.out.println("ilCognome"+ ilCognome);


        System.out.println(cognome==ilCognome);//false because it is different object because new
        System.out.println(cognome.equals(ilCognome));//true  SAME LOCATION
        System.out.println(cognome.isEmpty());//false

        cognome.clear();
        System.out.println(cognome.isEmpty());//true





















    }
}
