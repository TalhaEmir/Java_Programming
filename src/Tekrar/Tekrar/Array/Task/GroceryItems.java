package Tekrar.Tekrar.Array.Task;

import java.util.Arrays;

public class GroceryItems {

    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };
        System.out.println("========1===========");


        for(int i=0; items.length>i ; i++){
            String []items1D=items[i];
            for(int j=0; items1D.length> j; j++){
                String element=items1D[j];
                System.out.print(element+"\t");
            }
            System.out.print("\n");
        }

        System.out.println("====2===========");

        for(int i=0; items.length>i ; i++){
            String []items1D=items[i];
            for(int j=items1D.length-1; j>=0 ; j--){
                String element=items1D[j];
                System.out.print(element+"\t");
            }
            System.out.print("\n");
        }

System.out.println("=======3===============");
        for(int i=items.length-1; i>=0 ; i--){
            String []items1D=items[i];
            for(int j=0; items1D.length> j; j++){
                String element=items1D[j];
                System.out.print(element+"\t");
            }
            System.out.print("\n");
        }



    }
}
