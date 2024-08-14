package WEEK02.DAY03VARIABLES;

public class variablenamingrules {

    public static void main(String[] args) {


        //age of the student is 28
        //salary is 10000

        int age = 28;
        int salary = 10000;

        //int age= 32;

        // int age= 32 // variable name must be unique


        System.out.println("------------------------");

        int doubleSalary= 48; // variable name shouldbe camel letters
        double salaryBeforeTax= 12312441; // camel case


        System.out.println("------------------------");

        //variable names should start with letters or underscore (_) or $

        int number1= 10;
        int number2= 20;
        int number3= 30;

        // int 4number4= 40; that one cannot be because variable cannot start with number


        System.out.println("------------------------");
        int sum= 'A'+ 'B';

        System.out.println(sum);



        System.out.println("------------------------");

        //Variables cannot be java reserved word


        // double abstract= 5.5; // because variable named can not be java reserved words

        System.out.println("------------------------");

        //string for text
        // gender is male

        String gender= "Male";
        String fullName="Cydeo School";

        System.out.println("gender");
        System.out.println(fullName);

    }
}
