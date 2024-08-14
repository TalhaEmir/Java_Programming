package Arthurclass.Firstweek;

public class purchasecalculator1 {


    public static void main(String[] args) {

           /*
        Operators & Selection Statement Tasks:
1. Create a class named PurchaseCalculator.

 	1.1 Given the following variables:
           - salesTaxRate (double)
           - itemName (String)
           - unitPrice (double)
           - quantity (int)

    1.2 The program should calculate the total cost before tax, the sales tax, and the grand total.

    1.3 The program should display them on the console in the following format:

         Example:
	           itemName = "Fuji Apple"
	           unitPrice = 1.5
	           quantity = 5
	           salesTaxRate = 8

         Output:
	           Item name: Fuji Apple
	           Unit price: $1.5
	           Quantity: 5

	           Total cost before tax: $7.5
	           Sales tax: $0.6
	           ==========================
	           Grand Total: $8.1

         */


        String itemName="Apple";
        double  unitPrice=1.5;
        int quantity=5;
        double  salesTaxRate=8;


        double costBeforeTax=quantity*unitPrice;
        double salesTax=costBeforeTax+salesTaxRate;
        double grandTotal=costBeforeTax+salesTax;


        System.out.println("Item Name: "+itemName);
        System.out.println("Unit Price: "+unitPrice);
        System.out.println("Quantity: "+quantity);

        System.out.println("Total cost before tax: "+costBeforeTax);
        System.out.println("Sales Tax Rate: "+salesTaxRate);
        double grandTotalAfterTax=grandTotal+salesTax;

    }
}
