package week07.Day18.GarbageCollection;

import org.w3c.dom.ls.LSOutput;
import week07.day17CustomClass.Dog;

public class GarbageCollection {

    public static void main(String[] args) {

        //new GarbageCollection().finalize();

        String s1="Java";
        s1=null;// java will be eligible for garbage collection

        System.out.println(s1);
       // System.out.println(s1.toLowerCase());

        //System.out.println(s1.replace(null, "Phyton"));

        System.out.println("==================================");

       String str1="Phyton";
       str1="CYDEO";

       System.out.println(str1);


        System.out.println("==================");

        Dog dog1=new Dog();
        dog1.setInfo("Loki", "Husky",'m',3,"Medium", "black");


        Dog dog2=new Dog();
        dog2.setInfo("chuck", "bulldog",'m',5,"small", "white");

        //both of them right now eligilble for garbage collector
        dog1=null;

        //dog1=dog2;


        //new Dog().finalize();



    }



}
