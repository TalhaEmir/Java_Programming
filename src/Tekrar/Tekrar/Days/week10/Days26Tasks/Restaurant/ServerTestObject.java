package Tekrar.Tekrar.Days.week10.Days26Tasks.Restaurant;

public class ServerTestObject {

    public static void main(String[] args) {


        Server garson1= new Server("Emmi",105,22.5,true);

        Server garson2=new Server("Talha",102,10.5,false);

       garson1.takeOrder();//Talhais taking order

        Server garson3=new Server("Talha");

        garson2.takeOrder();

        System.out.println( garson3);


    }
}
