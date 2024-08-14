package Haydenclass.Week06.Week0hocaninkiler;

import java.util.Scanner;

public class emailDomain1 {


    public static void main(String[] args) {
            /*
             Create a method named emailDomain that can display the domain of the email
        Ex:
            emailDomain("Cydeo@gmail.com")

            output:
                domain: gmail
             */

        Scanner input = new Scanner(System.in);

        System.out.print("Enter email address: ");
        String email = input.next();
        System.out.println(domainName(email));


    }

    public static String domainName(String email) {

        String domain=email.toLowerCase().substring(email.indexOf('@')+1, email.lastIndexOf('.'));
        return domain;

    }
}
