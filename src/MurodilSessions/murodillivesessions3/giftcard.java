package MurodilSessions.murodillivesessions3;

public class giftcard {

    public static void main(String[] args) {
     /*   GiftCard
        declare and assign a gift card with 200.0
        declare and assign String variable items and assign ""
        buy 2 items.
                buy item 1 for x price and subtract from your gift card,
        also add item name to items
        buy item 2 for x price and subtract from your gift card,
        also add item name to items
        print the remaining balance of your gift card and all items


        */

       double giftCard= 200.0;
       String items=""; // assign empty string

        System.out.println("Buying shoes for 95");
        items +="shoes"; // concat "shoes" items
        giftCard -=95; // substract 95

        System.out.println("items= "+items);
        System.out.println("giftCard balance= $"+giftCard);


        System.out.println("buying computer bag for $40");
        giftCard -= 40;
        items +="computer bag";
        System.out.println("giftCard balance= $"+giftCard);
        System.out.println("items= "+items);





    }
}
