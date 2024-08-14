package Tekrar.Tekrar.Methods.Tasks;

public class Max {

    public static void main(String[] args) {

        boolean result=isOdd(100);
        System.out.println(result);
    }


    public static boolean isOdd(int number){
        boolean Odd=false;

        if(number%3==0){
            Odd=true;
        }

        return Odd;



    }
}
