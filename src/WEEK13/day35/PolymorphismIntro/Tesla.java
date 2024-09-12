package WEEK13.day35.PolymorphismIntro;

public class Tesla extends Car implements AutoPark, AutoPilot, Electric {
    public Tesla(String make, String model, String color, int year,double price){
        super(make, model, color, year, price);
    }

    public void charge() {
        System.out.println(getMake() + getModel() + " charged by electric");
    }

    public void autoPark() {
        System.out.println(getMake() + getModel() + " autoparking by itself because of stupid Elon Musk");
    }

    public void autoPilot() {
        System.out.println(getMake() + getModel() + " control itself");
    }




}
