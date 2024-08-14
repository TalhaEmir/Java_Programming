package week03.Day06ifstataement.tasks;

public class ifstatementsoddeven {

    public static void main(String[] args) {


        int number = 100;
        boolean isEven = number % 2 == 0;

        if (isEven) {
            System.out.println("Even Number");
        }
        if (!isEven) {


            System.out.println("Odd Number");
        }

        System.out.println("-------------------");

        if(number%2==0){
                System.out.println("Even Number");
        }
        System.out.println("-------------------");

        if(number%2==1){

            System.out.println("Odd Number");
        }


    }

}

