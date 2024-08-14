package MurodilSessions.week07intervievalso;

public class FizzBuzz {

    public static void main(String[] args) {

    /* LOOP FROM 1 TO 100
    AND PRINT FIZZBUZZ FOR NUMBERS DIVISIBLE BY 3 AND 5
    PRINT FIZZ TO NUMBERS DIVISIBLE BY 5
    OTHERWISE PRINT THE NUMBERS ITSELS
     */


        for (int i = 1; i <100 ; i++) {
            if (i % 5 == 0 && i % 3 == 0){// WHY WE PUTTINH THIS ONE FIRST BECAUSE FOR EXAMPLE
                //if we put firsst divisible by 3 and 5 and 3 and 5 it is not gonna go FIZZBUZZ
                System.out.println("FizzBuzz");

            }else if (i % 3 == 0 ) {
                System.out.println("Fizz");
            }else if (i % 5 == 0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
            }
        }



    }
}
