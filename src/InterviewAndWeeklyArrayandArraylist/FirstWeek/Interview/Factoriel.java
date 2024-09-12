package InterviewAndWeeklyArrayandArraylist.FirstWeek.Interview;

public class Factoriel {
    public static void main(String[] args) {



        System.out.println(getFactorial(5));



    }


    public static int getFactorial(int n){

        int factorial=1;

        for(int i=1; i<=n ; i++){
            factorial*=i;
        }

        return factorial;

    }



    public static int factorial(int n1){
        int result=1;
        while(n1>1){
            result*=n1--;
        }

        return result;
    }


    public static int fact(int n){
        if(n==1){
            return 1;
        }

        return n*fact(4);
    }
}
