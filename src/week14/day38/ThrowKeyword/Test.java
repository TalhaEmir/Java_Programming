package week14.day38.ThrowKeyword;

import Utilities.Library;
import week14.day38.BreakTimeException;

import java.time.LocalTime;

public class Test {


    public static void main(String[] args) {

        String name="Talha";

        name.substring(1,3);

        System.out.println("Hello Cydeo");

        //Thread.sleep(3500);

        Library.sleep(3.5);


        System.out.println("How are you today");

        int [] arr1={1,2};

        System.out.println("==============================");

        if(LocalTime.now().equals(LocalTime.of(4,0))){
            throw new BreakTimeException();
        }

       // throw new RuntimeException("iT IS A BREAK TIME ");

     throw new BreakTimeException("Time to go home ");

       //throw new BreakTimeException();

    }






}
