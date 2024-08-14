package MurodilSessions.murodilsessions4;

import java.util.Scanner;

public class loginapp {
    public static void main(String[] args) {

        /*

        LoginApp [scanner, if statements, nested]
   inputs:
    declare and assign a 4 digit pin code
    declare and assign the last 4 digits of ssn: 1234

    declare and assign expected values for both
        example expected:
            pin: 1552
            ssn: 1234

    outputs:

        when the pincode and ssn match the expected print:
            Authentication successful

        when the pincode or ssn are not correct print:
            Authentication failed

        when the pincode was not correct print:
            incorrect pin code

        when the ssn is not correct print:
            invalid ssn


         */

        var input = new Scanner(System.in);

        Scanner input2 = new Scanner(System.in);

        //secret, expected values
        int expectedPinCode=2211;
        int expectedSsn=4432;

        System.out.println("Enter your pincode and last 4 digits of ssn:");
        int pinCode=input.nextInt();
        int ssn=input.nextInt();

        input.close();
        System.out.println("Pincode= " + pinCode);
        System.out.println("SSN= " + ssn);
        input.close();

        if(pinCode==expectedPinCode && ssn==expectedSsn){
            System.out.println("Authentication Successful");
        }else {
            System.out.println("Authentication Failed");
                //reason why failed
            if(pinCode != expectedPinCode){
                System.out.println("Incorrect pincode");
            }
            if(ssn != expectedSsn){
                System.out.println("Incorrect ssn");
            }




        }

    }


}
