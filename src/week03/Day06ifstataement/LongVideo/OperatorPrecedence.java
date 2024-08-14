package week03.Day06ifstataement.LongVideo;

public class OperatorPrecedence {

    public static void main(String[] args) {


        System.out.println(5 + 2 *3);
        // if we want to do something first but mathmatically it is not first you have to paranthesis double

        System.out.println( (5+ 4) * 3);
        System.out.println(-5 + 3);

        System.out.println(10>9 == 8<7);
        System.out.println(11> 10 == 9>12 && "java" == "Phyton" || 'a'== 'A');
        //                   TRUE     FALSE  &&    FALSE            || FALSE
        //                          FALSE   &&      FALSE  || FALSE
       //                                       FALSE \\ FALSE
       //                                               FALSE


        System.out.println(100>=20 && 30*2 >60);

        int a= 20;
        a +=10+2 * 3;
        System.out.println(a);

    }
}
