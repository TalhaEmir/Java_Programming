package week03.DAY07ifstatements.tasks;

public class NETINCOME123 {

    public static void main(String[] args) {


        /*

    3. Create a class named NetIncomeCalc, Write a program that can calculate the salary after tax based on the following requirements
                the tax rates are:
                        35% for salary of 130K or more
                        30% for salary of 100K to 129k
                        25% for salary of 80K to 99K
                        20% for salary of 79K or less

                in addition:
                	if the person is married, he/she will pay 5% less tax
         */



        double salary = 75000; // Farklı maaşları test etmek için bu değeri değiştirebilirsiniz
        boolean isMarried = false; // Evli olup olmadığını belirtir
        double taxRate = 0.0;

        // Evlilik durumuna göre vergi oranını başlangıçta azalt
        if (isMarried) {
            taxRate -= 0.05;
        }

        // Vergi oranını belirle
        if (salary >= 130000) {
            taxRate += 0.35;
        } else if (salary >= 100000) {
            taxRate += 0.30;
        } else if (salary >= 80000) {
            taxRate += 0.25;
        } else {
            taxRate += 0.20;
        }

        // Sonuçları yazdır
        System.out.printf("Vergi Oranı: %.0f%%\n", taxRate * 100);
        double tax = taxRate * salary;
        System.out.println("Vergi Miktarı: " + tax + " TL");
        double netIncome = salary - tax;
        System.out.println("Net Gelir: " + netIncome + " TL");
    }
}
