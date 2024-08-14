package week11.Day30.Day30WarmUp;

public class Iphone extends Phone {// iphone is a phone relationship is created with extedns


    public static boolean hasApplePay=true;

    public Iphone(String model, char size, int price, String color){// brand of all the iphone is apple
       super("Apple",model,size,price,color);// why we deleted brand at the constructor and put the brand name at the super part

        // of the brand unnecessary like static but not but brand for whole is apple we dont need to brand again
    }

    public void faceTime(long phoneNumber){
        System.out.println(getBrand() + getModel() + " phone is face timing with " + phoneNumber);
    }


    public void faceTile(String email){
        System.out.println(getBrand() + getModel() + " phone is face timing with " + email);
    }



}
