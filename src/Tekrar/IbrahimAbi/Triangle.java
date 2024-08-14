package Tekrar.IbrahimAbi;

public class Triangle {
    /*1- Create a class named Triangle and use a nested loop to display the following shape on the console:

				*
				* *
				* * *
				* * * *
				* * * * *
				* * * * * *
				* * * * * * *
				* * * * * * * *
				* * * * * * * * *
				* * * * * * * * * *
*/

    public static void main(String[] args) {

        int rows = 10; // Number of rows in the triangle

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println(" i degeri: "+i);
        }








      /*  for (int i = 1; i <= rows; i++) {
            for (int j = rows; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println(" i degeri: "+i);
        }
        */

    }

}


