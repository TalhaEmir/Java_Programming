package week04.DAY010;
import java.util.Scanner;

public class shippingclass {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);//2-) Enter gonna be in there because building number section is next

        System.out.println("Enter your full name: ");
        String full_name = input.nextLine(); //Cydeo School + Enter

        System.out.println("Enter building number");
        String building_number = input.next();
       //  1-) 792 A + Enter (next not gonna take it Enter then it is gonna be at the Scanner)

        input.nextLine();// CLEAR THE SCANNER

        System.out.println("Enter street name");// Pendik + Enter
        String street_name = input.nextLine();

        System.out.println("Enter city name");// Istanbul + Enter
        String city = input.nextLine();

        System.out.println("Enter state");//Marmara bolgesi + Enter
        String state = input.nextLine();

        System.out.println("Enter zip code");
        String zip = input.nextLine();


        System.out.println("Enter phone number");
        String phone = input.next();



        input.close();

        System.out.println("Full name: " + full_name);
        System.out.println("Building number: " + building_number);
        System.out.println("Street name: " + street_name);
        System.out.println("City: " + city);
        System.out.println("State: " + state);
        System.out.println("Zip code: " + zip);
        System.out.println("phone = " + phone);


    }
}
