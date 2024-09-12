package Tekrar.Tekrar.Array.Task2;

import java.util.Arrays;

public class GroceryItems {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
         for(int i=0; items.length> i;i++){

            System.out.println(Arrays.toString(items[i]));
         }
        System.out.println("======================================");



        for(int i=0; items.length> i;i++){
            for(int j=items[i].length-1; j>=0; j--) {
                System.out.print(items[i][j] + "\t");
            }
            System.out.println();
        }


    }
}
