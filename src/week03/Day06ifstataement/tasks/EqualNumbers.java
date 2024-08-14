package week03.Day06ifstataement.tasks;

public class EqualNumbers {

    public static void main(String[] args) {

        /* Create a class named EqualNumbers, and write a program that can check the equality of the three given numberrs
            declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
            if only n1 and n2 are equal  =>print  "n1&n2 are equal"
            if only n2 and n3 are equal ==>print "n2&n3 are equal"
            if only n3 and n1 are equal ==>print "n3&n1 are equal"
            if none of them are equal ==> none of them are equal

            */


        int number1= 10;
        int number2= 10;
        int number3= 10;

        String result="";


        if(number1==number2 && number2==number3){
            result="all equal";
        } else if (number1==number2) {
            result="n1&n2 are equal";
        } else if (number2== number3) {
            result="n2&n3 are equal";

        } else if (number3==number1) {
            result="n3&n1 are equal";

        }else {
            result="not equal";


    }

        System.out.println(result);

    }



}
