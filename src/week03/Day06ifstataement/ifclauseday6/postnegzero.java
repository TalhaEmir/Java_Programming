package week03.Day06ifstataement.ifclauseday6;

public class postnegzero {

    public static void main(String[] args) {

        int number= 20;
        String result="";

        if(number<0){
            result="02 is the negative number";
        }if(number>0){
            result=" 20 is the positive number";
            System.out.println("result = " + result);
        }else {
            result=" 0 is the negative number";
        }


    }
}
