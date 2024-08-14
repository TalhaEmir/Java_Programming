package MurodilSessions.WEEK05murodil;

import java.lang.module.FindException;

public class Mathresult {

    public static void main(String[] args) {

        String math= "100+5=105";
        String n1= math.substring(0, math.indexOf('+'));
        String n2=math.substring(math.indexOf('+') + 1,math.indexOf('=') );
        String result= math.substring(math.indexOf("=")+1);


        System.out.println("n1 = "+ n1);
        System.out.println("n2 = "+ n2);
        System.out.println("result ="+ result);


        System.out.println(math.indexOf("*"));
    }
}
