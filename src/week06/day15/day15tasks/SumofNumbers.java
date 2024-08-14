package week06.day15.day15tasks;

public class SumofNumbers {
    public static void main(String[] args) {


      int number=50;
      int sum=0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;

    }

        System.out.print(" " + sum);




    }

    public static int calculateSum(int number) {
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

