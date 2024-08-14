package MurodilSessions.murodillivesessions3;

public class arithmeticoperators {

   // tip options


    public static void main(String[] args) {
        //

        //string food (list of all the food)
        String food="burgers, fries,drink";
        //double itemprice=7.50 , 3.0 , 3.50

        double item1Price= 7.50;
        double item2Price= 3.00;
        double item3Price= 3.50;

        double total=item1Price+item2Price+item3Price;
//your total is total
        System.out.println("The food items you ordered = +"+ food);
        System.out.println("Your total is $" + total);

        System.out.println("select one of the tip options");
        System.out.println("10%= $" + total * 0.10);
        System.out.println("18%= $" + total * 0.18);
        System.out.println("25%= $" + total * 0.25);

        System.out.println();

    }
}
