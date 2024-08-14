package week10.Day27.Utilities;
//import week10.Day27.Data;
import static week10.Day27.Data.d;
import week10.Day27.Data;
import static week10.Day27.Data.method3;

import static week10.Day27.Data.*;// it gave import every static members

public class Test2 {
    public static void main(String[] args) {

//System.out.println(Data.d); no more need class name because we import

        System.out.println(d);
       method3();

//import static week10.Day27.Data.*;// it gave import every static members
        System.out.println(e);

        System.out.println(f);
        method4();

        //System.out.println(a);// you can not get it  because it is instance


        //static methods get just static methods




    }
}
