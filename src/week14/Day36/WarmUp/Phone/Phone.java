package week14.Day36.WarmUp.Phone;

import java.util.Arrays;

public class Phone {

    /*public void setInfo(String brand,String model,char size, int price,String color ){
        setBrand(brand);
        setModel(model);
        setSize(size);
        setPrice(price);
        setColor(color);

    }*/

    public Phone(String model, String size, int price, String color) {
        this.brand=getClass().getSimpleName();
        setModel(model);
        setPrice(price);
        setSize(size);
        setColor(color);
    }

    private String brand;

    private String model;

    private String size;

    private int price;

    private String color;


    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand=brand;
    }


    public String getModel(){
        return model;
    }

    public void setModel(String brand){
        this.model=brand;
    }


    public String getSize(){
        return size;
    }

    public void setSize(String size){
        this.size=size;
    }


    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        if(price>0){
            this.price=price;
        }else{
            System.out.println("Price can not be this " + price);
            System.exit(1);
        }
    }


    public String getColor(){
        return color;
    }


    public void setColor(String color){

      String[]colors={"Black","White","Silver","Gold","Pink"};
      if(Arrays.asList(colors).contains(color)){
          this.color=color;
      }else{
          System.err.println("Invalid Color" + color + " color of the can only be: " + Arrays.toString(colors));
          System.exit(1);
      }

    }



    public void call(long phoneNumber){
        System.out.println(brand + model + " phone is calling " + phoneNumber);
    }

    public void text(long phoneNumber){
        System.out.println(brand + model + " phone is texting " + phoneNumber);
    }




    public String toString() {
        return getClass().getSimpleName() +
                ", model='" + getModel() + '\'' +
                ", size=" + getSize() +
                ", price=" + getPrice() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
