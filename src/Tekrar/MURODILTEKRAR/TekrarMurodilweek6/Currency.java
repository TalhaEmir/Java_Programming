package Tekrar.MURODILTEKRAR.TekrarMurodilweek6;

public class Currency {

    public static void main(String[] args) {

        System.out.println( getCurrency("eur", 100));
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

    }


    public static double getCurrency(String unit, double amount) {
        double currency = 0;

        if (unit == "eur") {
            currency = amount* 0.91;
        }else if (unit == "yen") {
            currency = amount * 121.03;
        }else if (unit == "lira") {
            currency = amount * 14.85;
        }else if (unit == "won") {
            currency = amount * 1217.52 ;
        }else if (unit == "rupi") {
            currency = amount * 181.45;
        }else{
            currency = amount;
        }

        unit= unit.toLowerCase();
        return currency;

    }
}
