package MurodilSessions.week06;

public class MultiplicationTable {
    public static void main(String[] args) {

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

        /*overload the previous multiplication table method to accept the number for the table and also the
        //ending point for the multiplication(the default was before was 10)

        ex: inputs: 3, 20
        result would print the multiplication table of 3 up until 20
        3 x 1 = 3
                ...
        3 x 20 = 60
*/
        int x = 2;
        for (int i = 1; i <= 10; i++) {
            System.out.println(x + " x " + i + " = " + x * i);

            System.out.println("===============================");

            multiplicationTable(1);
            multiplicationTable(9);
            System.out.println("===============================");
            multiplicationTable(3,5);


        }


    }

    public static void multiplicationTable(int numa) {
        for (int i = 1; i <= 10; i++) { //num2 5
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