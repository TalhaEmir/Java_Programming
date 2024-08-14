package MurodilSessions.murodillivesessions3;

public class pizzaslice {

    public static void main(String[] args) {

     /*   PizzaSize[multi branch if, char]
        declare char pizzaSize.
        can be 'S', 'M','L'
        print message for selection.
                If all false, invalid selection


                */


        char pizzaSlice = 'D';

        String result = "";

        if (pizzaSlice == 'S') {
            result = "Pizza Slice is = " + pizzaSlice;
            System.out.println("result = " + result);

        } else if (pizzaSlice == 'M') {
            System.out.println("You selected small pizza");
        } else if (pizzaSlice == 'L') {

            System.out.println("You selected Medium pizza");
        } else {

            System.out.println("invalid selection, needs to be S,M or L");
        }
//make insensitive

        if (pizzaSlice == 'S' || pizzaSlice == 's') {
            System.out.println("You selected small pizza");

        } else if (pizzaSlice == 'm' || pizzaSlice == 'M') {
            System.out.println("You selected Medium pizza");

        } else if (pizzaSlice == 'L' || pizzaSlice == 'l') {
            System.out.println("You selected Large pizza");
        } else {
            System.out.println("invalid selection, needs to be S,M or L");


        }
    }


}
