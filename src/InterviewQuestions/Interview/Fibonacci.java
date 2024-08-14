package InterviewQuestions.Interview;

public class Fibonacci {

    public static void main(String[] args) {//1, 1,2,3,5,8,13,21,34,55...

        fibonacci(9);
    }

    public static void fibonacci(int n){
        int num1 = 0;
        int num2 = 1;
        int result =0;

        System.out.print(num1 + " ");
        System.out.print(num2 + " ");
        if(n==0){
            result = 0;
        } else if (n==1) {
            result = 1;
        }else{
            for(int i = 2;i<=n;i++){
                result = num1+num2;
                num1=num2;
                num2=result;
                System.out.print(result+" ");
            }
        }

    }
}
