package MurodilSessions.week09;
import java.util.ArrayList;
import java.util.Arrays;

public class Week09ArrayVsArrayList {

    public static void main(String[] args) {
       // common interview questions =
       // array = fixedsize, can printed with to print allow both primitive and object
       // array list= dynamic size can be printed directly , only allows object types
       //

        int[]numsArr= new int[3];
        numsArr[0]=44;
        numsArr[1]=33;
        numsArr[2]=88;
        //1)Areay is fixed size;
        System.out.println(numsArr[0]);
        //numsArr[3]=99; ArrayIndexOutOfBoundsException


        //ArrayList-- is dynamic size

        ArrayList<Integer>numList=new ArrayList<>();
        numList.add(44);
        numList.add(33);
        numList.add(88);
        numList.add(33);
        numList.add(234);

        //2)Array can hold both primitives and objects
        char[] charsArr={'a','b','c'};
        Character[]charsArr2={'a','b','c'};
        String[]starr={"a","b","c"};
        //2)ArrayList and other classes in collections framwork can only hold object types
        //ArrayList<char>charList:error
        ArrayList<Character>charList=new ArrayList<>();//internally array is set to size 10
        charList.add('a');charList.add('b');charList.add('c');charList.add('d');
        /*
        interview questions=even if you add 9, default will be 10?
               or if we add 1 it will have 10 caps,and when we add 2 it will be 20?
      interview questions=  Array support primitives and  object
      ArrayList support object
*/

        System.out.println(starr);//[Ljava.lang.String;@7b23ec81
        System.out.println(Arrays.toString(starr));//[a, b, c]
        System.out.println(charList);//[a, b, c, d]



    }
}

