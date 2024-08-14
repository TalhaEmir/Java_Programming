package week08.day20.Methods;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {10, 20, 30, 40, 50, 60, 70, 80, 90};

        for (int i = 0; numbers.length> i; i++) {
            System.out.println(numbers[i]);
            
        }

        System.out.println("======================");


        for (int each  : numbers){

            System.out.print(" " +each);
        }






    }
}
