package week06.Day14.tasks;

public class method {


    public static void main(String[] args) {

                operator(1,2,'+');


    }

    public static int operator(int a, int b, char c) {
        int sum = 0;

        if (c=='+'){
            return a+b;

        }else if (c=='-'){
            return a-b;
        }else if (c=='*'){
            return a*b;
        }else if (c=='/'){
            return a/b;
        }

        return sum;






    }



}
