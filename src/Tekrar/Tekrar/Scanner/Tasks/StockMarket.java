package Tekrar.Tekrar.Scanner.Tasks;
import java.util.Scanner;

public class StockMarket {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How many total share do you have already");
        int totalShare= input.nextInt();

        input.close();

        if(totalShare>0 ){

            System.out.println("How much your total value of your share int he stock market");
            double shareValue= input.nextDouble();
            input.nextLine();
            System.out.println("which company have the most shares in stock market");
            String company=input.nextLine();

            System.out.println("Your total stock market holding is" + shareValue+ "which is made up of" + totalShare +company + "is your company holdings" );


        }else{
            System.out.println("invalid value");
        }












       /* 8. Create a class named StockMarket:
        - Ask the user how many total shares they have already? (int)
                -> If the user gives 0 or give a negative number none of the rest condition should be executed

                - Ask the user how much their total value in the stock market is (double)
                - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

                - Print in the following format:
        Ex:
        inputs: 100, 25000, Apple INC

        "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"

                */
    }
}
