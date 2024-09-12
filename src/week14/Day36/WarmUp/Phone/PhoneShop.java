package week14.Day36.WarmUp.Phone;

import week14.Day36.WarmUp.Car.AUDI;
import week14.Day36.WarmUp.Car.Car;
import week14.Day36.WarmUp.Car.Honda;
import week14.Day36.WarmUp.Car.Tesla;

public class PhoneShop {

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public static void main(String[] args) {
        Nokia nokia3310= new Nokia("A-33.10","L",900,"Silver");
        System.out.println(nokia3310);
            Iphone iphone= new Iphone("Model iphon12","l", 1005,"Black");




        System.out.println(nokia3310);

        nokia3310.selfDefense();

        iphone.faceTime(781938323);
        Samsung samsung=new Samsung("Note2","l", 1005,"Black");
        samsung. freeze();

        System.out.println(iphone);
        System.out.println(nokia3310);
        System.out.println(samsung);
        int numberOfIphone=0;
        int numberOfSamsung=0;
        int numberOfNokia=0;

        Phone[] phones = {
                new Iphone("Iphone 11 Pro", "Large", 900, "Black"),
                new Iphone("Iphone 12 Pro Max", "Large", 1200, "Black"),
                new Iphone("Iphone 9", "Medium", 800, "Gold"),
                new Samsung("Galaxy S19", "Medium", 700, "Pink"),
                new Samsung("Galaxy S20", "Large", 850, "Silver"),
                new Samsung("Galaxy S21", "Large", 950, "Silver"),
                new Nokia("XR20", "Small", 350, "White"),
                new Nokia("G10", "Medium", 99, "Gold"),
                new Nokia("G50", "Large", 250, "Silver"),
                new Iphone("Iphone 12 Pro", "Large", 1200, "Black"),
                new Iphone("Iphone 11 Pro Max", "Large", 1100, "Silver"),
                new Samsung("Galaxy S18", "Medium", 750, "White"),
                new Samsung("Galaxy S17", "Large", 650, "Silver"),
                new Nokia("G10", "Medium", 99, "Black"),
                new Iphone("Iphone 6", "Small", 400, "Gold"),
                new Iphone("Iphone 7", "Small", 500, "White")
        };

       //  Iphone phone= new Phone(); sub class can not be reference for parent object

       Phone phone= new Samsung("Galaxy S20", "Large", 850, "Silver"); // it can be

        for(Phone eachPhone: phones){
 
            System.out.println(eachPhone.getModel()+ "-" +eachPhone.getColor() + "-" + eachPhone.getPrice() );

            if(eachPhone instanceof Iphone){
                numberOfIphone++;
            }else if(eachPhone instanceof Samsung){
                numberOfSamsung++;
            }else{
                numberOfNokia++;
            }
        }

        for(Phone eachPhone: phones){
            int price = eachPhone.getPrice();
            boolean forIphone = eachPhone instanceof Iphone && price >=700;
            boolean forSamsung = eachPhone  instanceof Samsung && price>=700 ;
            if(forIphone || forSamsung ){
                System.out.println(eachPhone.getModel());
            }

        }

        System.out.println(" number of iphone " + numberOfIphone+ "number of samsung  " + numberOfSamsung+ " number of nokia" +numberOfNokia );
    }
}
