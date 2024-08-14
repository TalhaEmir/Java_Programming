package week11.Day30.Day30WarmUp;

public class Samsung extends Phone {

    public Samsung(String model, char size, int price, String color){
        super("SAMSUNG",model,size,price,color);
    }
    public void freeze(){
        System.out.println(getBrand() + getModel() + " phone is freezing a lot" );
    }


}
