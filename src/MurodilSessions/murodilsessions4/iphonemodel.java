package MurodilSessions.murodilsessions4;

public class iphonemodel {
    public static void main(String[] args) {


        /*

        IPhoneModels [switch -> enhanced switch]
    Goto https://www.apple.com/shop/buy-iphone
    Declare and initialize String variable iphoneModel
    declare monthlyPayment and assign value based on model
         */

        //if (iphoneModel.equals("15 Pro") || iphoneModel.equals("15 Pro max) ){}


        String iphoneModel="15 Pro";
        double monthlyPayment=0;

        switch(iphoneModel){
            case "15 Pro":
            case "15 Pro Max":
                monthlyPayment=41.62;
                break;
            case "15 Plus":
                monthlyPayment=33.29;
                break;
            case "14 Plus":
                monthlyPayment=17.87;
                break;

            default:
                System.out.println("Invalid input");


        }


        System.out.println("Iphone model is "+ iphoneModel + " monthlyPayment = " + monthlyPayment);


    }
}
