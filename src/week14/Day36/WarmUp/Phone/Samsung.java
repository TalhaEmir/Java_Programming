package week14.Day36.WarmUp.Phone;

public class Samsung extends Phone {

    public Samsung(String model, String size, int price, String color){
        super(model,size,price,color);
    }
    public void freeze(){
        System.out.println(getBrand() + getModel() + " phone is freezing a lot" );
    }


}
