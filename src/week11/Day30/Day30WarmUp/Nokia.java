package week11.Day30.Day30WarmUp;

public class Nokia extends Phone {


    public Nokia(String brand, String model, char size, int price, String color){
        super(brand,model,size,price,color);
    }
    public void selfDefense(){


        System.out.println(getBrand() + getModel() + "has  a self defense mode" );
    }


}
