package Testing5;


public class ArithmeticOperators {



    public static void main(String[] args) {

    System.out.println (10+ 20);
    System.out.println ("one"+20);
    System.out.println (100-20);
    System.out.println (30*4);
    System.out.println (30/4);
    System.out.println (30.0/4);
    System.out.println (30/4.25);

   // Concatenation: +

        System.out.println( 100 + 200);
        
        System.out.println(40-10);


        System.out.println(50/6);

        System.out.println(50/9.6);

        System.out.println(50.0/6);

        System.out.println(50d/ 6);

        System.out.println(  (int) (2.5/ 0.5) ); //if we want to int we have to cast in


        //MULTIPICATION

        System.out.println( 20*5);

/*
this is how Remainder calculator : numerator- ( denominator* integer result)

10/3= 3.333

remainder:
what is the numerator: 10
denominator: 3
what is integer result = 3

remainder: 10 -(3*3)=1

20/6= 3.3333

20- (6*3)=2


15/ 4= 3.75

If it is not exactly divisible it is reminder. that will be some reminder

15 - (4*3)= 3

At java 10 % 3====> 1

20 % 2===> 2

15 % 4===> 3


*/
        System.out.println(20%6);

        System.out.println(100%13);
        System.out.println(45%8);

    }
}
