package week03.Day06ifstataement.tasks;

public class identifynumber2 {

    public static void main(String[] args) {
        int number= 200;

        boolean isPositive = number > 0;
        boolean isNegative = number < 0;
        boolean isZero = number == 0;



        if(isPositive){
            System.out.println(number + " is positive");
        }
        if(isNegative){
            System.out.println(number + " is negative number");

        }
        if(isZero) {
            System.out.println(number + " is zero");
        }


    }
}
