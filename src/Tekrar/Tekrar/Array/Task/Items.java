package Tekrar.Tekrar.Array.Task;

public class Items {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };

        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};

        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};

        boolean containsIpad=false;

        int num=0;

        for(int i=0; i< items.length ; i++){
            if(items[i].equalsIgnoreCase("Gloves")){
                num=i;
            }
            if(items[i].contains("iPad")){
                containsIpad=true;
                break;
            }
            System.out.println(items [i]+"-"+prices[i]+"-" +"#ID"+ itemIDs[i] );
        }

        System.out.println( containsIpad);
        System.out.println( num);
    }
}
