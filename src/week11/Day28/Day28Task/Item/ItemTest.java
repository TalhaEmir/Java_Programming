package week11.Day28.Day28Task.Item;

public class ItemTest {
    public static void main(String[] args) {


        Item item1= new Item("2ed",15,13);
        System.out.println(item1);

        item1.setQuantity(-5.0);
        System.out.println(item1.getQuantity());


    }
}
