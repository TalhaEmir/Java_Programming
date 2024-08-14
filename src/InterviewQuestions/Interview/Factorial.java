package InterviewQuestions.Interview;

public class Factorial {
    public static void main(String[] args) {
        //factorial=1*2*3*...
        int factorial = 1;
        int number= 6;


        for (int i = 1; i <= number; i++) {
            factorial *=i;
        }

        System.out.println(factorial);

        System.out.println("=======================================================================");


        int newFactorial=factorial(6);


        System.out.println(newFactorial);
    }

    public static int factorial(int num){
        int factorial = 1;


        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;
    }

}
