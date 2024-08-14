package week06.Day14.tasks;

public class OddOrEven {

    public static void main(String[] args) {

        System.out.println(payment(45,40));


    }


    public static boolean isOdd(int num) {

        if (num % 2 == 0) {
            return false;
        } else {
            return true;

        }

    }


    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        }else {
            return false;
        }






    }


    public static double payment(double hourlyRate, int weeklyHours){


        double  annualSalary=hourlyRate * weeklyHours*52;

        return annualSalary;

    }


}
