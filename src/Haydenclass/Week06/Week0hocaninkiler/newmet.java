package Haydenclass.Week06.Week0hocaninkiler;

public class newmet {

    public static void main(String[] args) {
        emailDomain("alha@gmail.com");
    }


   public static void emailDomain(String email) {

        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println(domain);
    }

}

