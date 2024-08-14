package Week05.day12.task;

public class numbers {

    public static void main(String[] args) {
            maximumNumber(10,5000);

        System.out.println("+===================");

        maximumNumber(56,5);

        System.out.println("+===================");

    }


    public static void maximumNumber(double num1, double num2 ){


        if(num1==num2){
            System.out.println("Equal");
        } else if (num1>num2) {
            System.out.println("Maximum number is" + num1);

        } else if (num2>num1 ) {
            System.out.println("Maximum number is" + num2);

        }else {
            System.out.println("Invalid number");
        }


    }
}
