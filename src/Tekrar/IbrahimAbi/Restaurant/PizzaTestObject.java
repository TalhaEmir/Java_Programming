package Tekrar.IbrahimAbi.Restaurant;

public class PizzaTestObject {

    public static void main(String[] args) {
        Pizza pizza1= new Pizza();
        Pizza pizza2=new Pizza("Small");
        pizza2.numberOfCheeseTopping=2;
        pizza2.numberOfPepperoniTopping=4;

        System.out.println(pizza2);

       System.out.println(pizza2.getCompany());
    }
}
