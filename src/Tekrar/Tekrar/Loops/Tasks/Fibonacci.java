package Tekrar.Tekrar.Loops.Tasks;

public class Fibonacci {
    public static void main(String[] args) {
        int num1=0;
        int num2=1;
        int fibonacci=1;
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(fibonacci);

        // 0,1,1, 2,3,5,8,13


        // print until 5TH fibonacci sequence number


        for(int i=2; i<=5 ; i++){
            num1=num2;
            num2=fibonacci;
            fibonacci=num1+num2;
            System.out.println(fibonacci);
        }

    }
}
