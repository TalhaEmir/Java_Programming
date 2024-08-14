package week03.Day06ifstataement.LongVideo;

public class numbersofdays {

    public static void main(String[] args) {
        int n=1;
        boolean has28days= n==2; // if the month of number is 2(Feb), then it has 28 days
        boolean has31days= n== 1 || n==3 || n==5 || n==7 || n==8 || n== 10 || n==12;// then it has 31 days
        boolean has30days= !has28days && !has31days;

        String result= "";

        if(has28days){
            result= "28 days";

        }
        if(has31days){
            result= "31 days";
        }
        if(has30days){
            result="30 days";
        }
        System.out.println(result);

        }
    }


