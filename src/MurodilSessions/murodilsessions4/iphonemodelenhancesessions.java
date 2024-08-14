package MurodilSessions.murodilsessions4;

public class iphonemodelenhancesessions {
    public static void main(String[] args) {

        String iphoneModel = "iPhone 15 Plus";
        double monthlyPayment=0;
        switch (iphoneModel) {
            case "iPhone 15 Pro", "iPhone 15 Pro Max" -> monthlyPayment = 41.62;
            case "iPhone 15 ", "iPhone 15 Plus" -> monthlyPayment = 33.29;
            case "iPhone 14 " -> monthlyPayment = 29.12;
            case "iPhone 13 " -> monthlyPayment = 24.95;
            default -> monthlyPayment = 0;

            //enhancedswitch
            //
            /*

           switch(num) {
           case 1-> println ("Monday")
           case 2->println("Tuesday")
             */


        }
        System.out.println("Your " + iphoneModel + " will cost: " + monthlyPayment);

    }

}

