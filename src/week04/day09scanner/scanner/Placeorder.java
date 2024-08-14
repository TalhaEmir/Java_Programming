package week04.day09scanner.scanner;

import java.util.Scanner;

public class Placeorder {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the name of product name: ");
        String name = input.nextLine();
        System.out.println("Enter the price of product: ");
        double price = input.nextDouble();
        System.out.println("Enter the quantity of product: ");
        int quantity = input.nextInt();
        System.out.println("Enter the their first name: ");
        String firstName = input.next();

        input.close();
        double totalPrice = price * quantity;

        System.out.println(firstName + " your order for " + quantity +" " + name +" has been places." + " Your total is "+ totalPrice + "." );

    }
}
