package week14.Day36.WarmUp.Phone;

public class Nokia extends Phone {


    public Nokia(String model, String size, int price, String color){
        super(model,size,price,color);
    }
    public void selfDefense(){


        System.out.println(getBrand() + getModel() + "has  a self defense mode" );
    }


}
