 package Week05.day11.emirtask;

import java.util.Scanner;

public class emailtask2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Put your email");
        String email = input.nextLine();


        String firstName = email.substring(0, email.indexOf("_"));
        String lastName = email.substring(email.indexOf("_")+1 ,email.indexOf('@'));
        String domain= email.substring(email.indexOf('@')+1,email.indexOf('.'));


        firstName=firstName.substring(0,1).toUpperCase()+firstName.substring(1);
        lastName=lastName.substring(0,1).toUpperCase()+lastName.substring(1);

        System.out.println("Your First name is: " +firstName+"\n "+"your last name is"+
                lastName+"\nyour domain is= "+domain);



    }
}
