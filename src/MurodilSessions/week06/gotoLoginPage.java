package MurodilSessions.week06;

public class gotoLoginPage {


    public static void main(String[] args) {

 /*void method- loginTolms(String email,String password)
        @params= String email,String password
        return= void, nothing

        call enterEmail and enterPasword methods

        the perints clicking contionue buttom
         */

        /*
        void method-(String course, int day)
        prints"Going to <course> course..."
        "watching recording from <day> day...."

         */



        // void method- go to login page  prints opening chrom browser
        //NAVIGATING TO HTTPS://MY.CYDEO.COM
        //VOID NO PARAMS

       enterEmail("abv1234"); //
        enterEmail("talha_dogan@gmail.com");
        enterMail(); // always  System.out.println("Opening chrome browser");
        //System.out.println("navigating to https://my.cydeo.com");
        // we can not do   System.out.println(enterEmail("abv1234"););// it is void just we can do println
// it give compile

        //String del= enterPassword("fef"); compile


        loginToLms("talha@cydeo.com", "abc124");
        study("Java",10);
        study("java", 11);
        study("Software QA", 12);


    }
    public static void enterEmail(String email) { // we can pass value
        System.out.println("Entering<"+ email + "> to email field");


    }



    public static void enterMail() { // We can not pass any value
        // overloading same method name but different parameter
        System.out.println("Opening chrome browser");
        System.out.println("navigating to https://my.cydeo.com");
    }


    public static void enterPassword(String password) {
        if (password.isEmpty()) {
            System.out.println("Password can not be empty");
        }else {
            System.out.println("Entering <" + password+ " > password field");
        }
    }

    public static void loginToLms(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        System.out.println("Clicking Continue button");
    }

    public static void study(String course, int day) {


        if(course.isEmpty()|| day<0){
            System.out.println("Invalid course");
        }else {

            System.out.println("going to <" + course + "> course....");
            System.out.println("watching erecording" + day + ">....");
        }

    }



    }
