package Tekrar.Tekrar.Loops.Tasks;

public class Factorial {

    public static void main(String[] args) {

        int num=5;

        int factorial=1;

        while(num>1){
            factorial*=num;
            num--;

        }

        System.out.println(factorial);


    }
}
