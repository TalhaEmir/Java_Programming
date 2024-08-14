package week08.day19Array.Task;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.LinkedTransferQueue;

public class Items {
    public static void main(String[] args) {

    String[] items = {"Elma","Armut", "Ananas","Banana","Kiwi"};
    double [] prices={1.45, 2.30,3.30,4.40, 5.50};
        double totalprice=0;
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <items.length; i++) {

            System.out.println("What is your Item");
            items[i]=input.nextLine();
            System.out.println(items[i] + "-- " + prices[i]);
            System.out.println(" ");
            totalprice +=prices[i];


        }

        System.out.println(Arrays.toString(items)+ " --" + Arrays.toString(prices));
        System.out.println(totalprice);







    }
}
