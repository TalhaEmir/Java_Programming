package WEEK02.DAY04Concenation.Tasks;

public class ShippingAdressJava {

    public static void main (String[] args){


        String name= "Aaron Kissinger";
        String buildingNumber= "13621A";
        String streetName="  LEGACY CIRCLE";
        String city= "Fairfax, ";
        String state= "VA";
        Short zipcode= 22030;
        String local= buildingNumber + streetName;
        String location= city + state +" "+zipcode;

        System.out.println("Your Shipping adress is:\n\t "+ name + "\n\t " + local + "\n\t " + location);






    }
}
