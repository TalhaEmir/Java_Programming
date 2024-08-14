package Haydenclass.Week06.BenimYaptiklarim;

import java.util.Scanner;

public class emailDomain {

    public static void main(String[] args) {

        /*
         Create a method named emailDomain that can display the domain of the email
    Ex:
        emailDomain("Cydeo@gmail.com")

        output:
            domain: gmail
         */

        System.out.println(domainName("talha_dogan@gmail.com"));

    }


    public static String domainName(String email){

      String domain= email.toLowerCase().substring(email.indexOf('@')+1);



        return domain;



    }
}
