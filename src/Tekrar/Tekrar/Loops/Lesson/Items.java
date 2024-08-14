package Tekrar.Tekrar.Loops.Lesson;

import java.util.Arrays;
import java.util.Scanner;

public class Items {


    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        /*. Create an array named items with the length of 5
        2. Create an array named prices with the length of 5
        3. Ask user to enter item name and price 5 times and store them into the items and prices arrays
        4. calculate the total price of the arrays
        5. display each item name and price in separate lines

        ItemName -- Price*/


        double[]price=new double[5];
        String []item=new String[5];
        double sum=0;
        for(int i=0 ; 5>i ; i++){
            System.out.println("Enter your price");
          price[i]=input.nextDouble();
          sum +=price[i];
        }
        input.nextLine();
        for(int i=0 ; 5>i ; i++){

            System.out.println("Enter your item");
            item[i]=input.nextLine();
        }

        System.out.println(Arrays.toString(item));
        System.out.println(Arrays.toString(price));

    for(int i = 0, j = 0; i<item.length ; i++ , j++){
        System.out.println(item [i] +"--"+price[i]);

    }


/*for (int i = 0; i < 5; i++) {
    System.out.println("Enter the name of item " + i + ":");
    item[i] = input.nextLine(); // Önce item adını almak

    System.out.println("Enter the price of " + item[i] + ":");
    price[i] = input.nextDouble();
    sum += price[i];
    input.nextLine(); // nextDouble'dan sonra buffer'ı temizlemek için
*/




    }
}
