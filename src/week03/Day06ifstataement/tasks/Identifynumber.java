package week03.Day06ifstataement.tasks;

public class Identifynumber {

    public static void main(String[] args) {

        int identifyNumber= 200;
        boolean positive= identifyNumber>0;// If the number is greater than zero, then its a positive
        boolean negative= identifyNumber<0; // if th number is smaller than zero then it is going to be a negative
        //boolean zero= identifyNumber==0; if the number is equeal to 0 then gonna be 0
        boolean zero= !positive && !negative ; // if the  number is not equal positive and  not negative it is gonna be 0
        System.out.println("200 is positive number: " + positive );
        System.out.println("200 is negative number: "+ negative);

        System.out.println("200 is zero: " +  zero);




    }


}
