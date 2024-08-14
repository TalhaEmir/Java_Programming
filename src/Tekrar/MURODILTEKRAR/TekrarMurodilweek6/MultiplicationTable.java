package Tekrar.MURODILTEKRAR.TekrarMurodilweek6;

public class MultiplicationTable {

    public static void main(String[] args) {

      multiply(1);

      multiplicationTable(3,5);


        multiplication(3,6);

        cult(6,12);





      /*
        Multiplication Table [methods, loops, operators]

    create a method that will accept a number. Print the multiplication table for the give number up until 10

    print the results in this format:
        $number x 1 = result
        $number x 2 = result
        ...
        $number x 10 = result

        ex:
            number = 4
            4 x 1 = 4
            4 x 2 = 8
            ...
         */
    }
    public static void cult(int a, int b) {
        for (int i = 6; i <= b; i++) {
            System.out.println(a + " x " + i + " = " + a * i);
        }
    }

    public static void multiplication(int a, int b) {
        for (int i = 1; i <= b; i++) {
            System.out.println(a + " x " + i + " = " + a * i);

        }

    }

    public static void multiply(int numa) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(numa + " x " + i + " = " + numa * i);

        }


    }

    //                                       3      5
    public static void multiplicationTable(int num1, int num2) {
        for (int i = 1; i <= num2; i++) {
            System.out.println(num1 + " x " + i + " = " + num1 * i);
        }
    }
}