package Arthurclass.Firstweek;

public class Purchasecalculator {


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

        String itemName="Fuji Apple";
        double  unitPrice=1.5;
        int quantity=5;
        double  salesTaxRate=(double)8/100;

       //CALCULATE SEPERATELY
        double totalCost= unitPrice*quantity;
        double salesTax=totalCost*salesTaxRate;
        double grandTotal= unitPrice*quantity + unitPrice*quantity*salesTaxRate;



        System.out.println("Item name is : " + itemName);
        System.out.println("Unit price is : $" + unitPrice);
        System.out.println("Quantity is : " + quantity);

        System.out.println("\nTotal cost before tax: $" + totalCost);
        System.out.println("Sales tax is= $" + unitPrice*quantity*salesTaxRate);
        System.out.println("=======================");
        System.out.println("Grand total: $" + (unitPrice*quantity + unitPrice*quantity*salesTaxRate));
        System.out.println("" + unitPrice*quantity + unitPrice*quantity*salesTaxRate);












}




    }