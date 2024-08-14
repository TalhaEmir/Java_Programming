package week07.day17CustomClass.tasks.Item;

public class ItemClientsTest {

    public static void main(String[] args) {

        ItemClients pen = new ItemClients();
       pen.itemName="Pencil";
        System.out.println( pen.itemName);
      pen.itemPrice=10.5;
        System.out.println( pen.itemPrice);
        pen.quantity=5;
        System.out.println( pen.quantity);
        System.out.println(pen);

      System.out.println(pen.calcCost());




        ItemClients kare = new ItemClients();
        kare.itemName="Kare";
        System.out.println( kare.itemName);
        kare.itemPrice=10.5;
        System.out.println( kare.itemPrice);
        kare.quantity=6;
        System.out.println( kare.quantity);
        System.out.println(kare);



        ItemClients itemClients3 = new ItemClients();
        itemClients3.itemName="Item3";
        System.out.println( itemClients3.itemName);
        itemClients3.itemPrice=10.5;
        System.out.println( itemClients3.itemPrice);
        itemClients3.quantity=7;
        System.out.println( itemClients3.quantity);
        System.out.println(itemClients3);

    }
}
