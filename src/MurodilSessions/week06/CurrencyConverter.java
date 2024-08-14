package MurodilSessions.week06;

import org.w3c.dom.ls.LSOutput;

import javax.swing.*;
import java.sql.SQLOutput;

public class CurrencyConverter {

    public static void main(String[] args) {

        /*
Currency Converter [methods, conditional, operators]

create a method that will accept a currency type(String) and a currency amount (double)[as dollars]
and convert the currency from dollars to a different type.
return the converted number

Use the following sample rates for currency conversions
1 dollar = 0.91 euro
1 dollar = 121.03 yen
1 dollar = 14.85 lira
1 dollar = 1,217.52 won
1 dollar = 181.45 rupee

Note: Don't worry about decimal formats, focus on the code to create these conversions

Ex:
Input: euro, 100
convertTo("euro", 100) => 91
Output: 91

Ex:
Input: yen, 50
Output: 6051.5
 */

        double euros = covertTo("euro", 100.0);
        System.out.println("100 dollars to euros = " + euros);

        euros = covertTo(" EURO  ", 350.0);
        System.out.println("350 dollars to euros = " + euros);

        double yens = covertTo("yen", 55.0);
        System.out.println("55 dollars to yens = " + yens);

        double peso = covertTo("peso", 20);
        System.out.println("20 dollars to peso = " + peso);
    }



    //convertTo("euro", 100); => 91.0
    //convertTo("yen", 25); => ?
    public static double covertTo(String currency, double amount) {
        double convertedAmount = 0;
        //convert to lowercase and trim spaces. " YEN " -> " yen " -> "yen"
        currency = currency.toLowerCase().trim();

        switch (currency) {
            case "euro":
                convertedAmount = amount * 0.91;
                break;
            case "yen":
                convertedAmount = amount * 121.03;
                break;
            case "lira":
                convertedAmount = amount * 14.85;
                break;
            case "won":
                convertedAmount = amount * 1217.52;
                break;
            case "rupee":
                convertedAmount = amount * 181.45;
                break;
            default:
                System.out.println("Conversion not available to " + currency);
        }

        return convertedAmount;



    }


/*
    return switch (currency) {
            case "euro" ->  amount * 0.91;
            case "yen" ->  amount * 121.03;
            case "lira" ->  amount * 14.85;

 */





    public static double covertToV2(String currency, double amount) {
        double convertedAmount = 0;
        //convert to lowercase and trim spaces. " YEN " -> " yen " -> "yen"
        currency = currency.toLowerCase().trim();

        switch (currency) {
            case "euro" -> convertedAmount = amount * 0.91;

            case "yen" -> convertedAmount = amount * 121.03;

            case "lira" -> convertedAmount = amount * 14.85;

            case "won" -> convertedAmount = amount * 1217.52;

            case "rupee" -> convertedAmount = amount * 181.45;

            default -> System.out.println("Conversion not available to " + currency);
        }

        return convertedAmount;
    }
}





