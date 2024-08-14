package Tekrar.IbrahimAbiTekrar;

public class Fibonacci {

    public static void main(String[] args) {


        int num1=0;
        int num2=1;

        int fibonacci=1;

        for(int i=1;i<=10;i++){
            num1=num2;
            num2=fibonacci;
            fibonacci=num1+ num1;
        }
        System.out.println("Fibonacci number "+fibonacci);
    }
}
