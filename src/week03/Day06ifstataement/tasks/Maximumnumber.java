package week03.Day06ifstataement.tasks;

public class Maximumnumber {

    public static void main(String[] args) {

        int num1= 10;
        int num2= 20;

        if(num1>num2){
            System.out.println(num1 + " is maximum number");
        }

        if (num2>num1){
            System.out.println(num2 + " is maximum number");
        }

        if(num1==num2){
            System.out.println(num1 + " is equal to " + num2);
        }
    }
}
