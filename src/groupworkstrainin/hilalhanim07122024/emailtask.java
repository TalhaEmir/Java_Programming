package groupworkstrainin.hilalhanim07122024;

public class emailtask {

    public static void main(String[] args) {


        String email ="hilal_shabouk@gmail.com";

        String name=email.substring(0,email.indexOf('_'));
        String surName=email.substring(email.indexOf('s'),email.indexOf('@'));
        System.out.println("Name: "+name);
        System.out.println("SurName: "+surName);
        String domain=email.substring(email.indexOf('@'));
        System.out.println("Domain: "+domain);

        String reverse= surName + "_" + name+domain;
        System.out.println(reverse);



    }
}
