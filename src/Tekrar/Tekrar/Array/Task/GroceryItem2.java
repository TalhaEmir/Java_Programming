package Tekrar.Tekrar.Array.Task;

public class GroceryItem2 {
    public static void main(String[] args) {

        String[][] items = {
                {"Apple", "Banana", "Grape", "Avocado"},
                {"Paper Towels", "Toilet Papers", "Tissues", "Diapers"},
                {"Coke", "Fanta", "Arizona Tea", "Pepsi", "Water"}
        };


        for(String[]each: items){
             for(String eachItem: each){
                 System.out.print(eachItem+"\t");
             }
            System.out.println();

        }

    }
}
