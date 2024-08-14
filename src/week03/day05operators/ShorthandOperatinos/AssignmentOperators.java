package week03.day05operators.ShorthandOperatinos;

public class AssignmentOperators {

    public static void main(String[] args) {

        int a= 20;
        System.out.println(a); //20
        System.out.println(a); //20

        a =40;

        System.out.println(a);

        a=90;

        System.out.println(a);


        System.out.println("----------------");

        //shorthand operator

        double balance= 100.0; //implicit casting

        balance += 1000; // balance

        balance +=500; // balance= reassigned 1000+500

        System.out.println(balance);

        balance += 10000;
        System.out.println("balance = " + balance);

        balance -= 1000;//balance 11600-1000

        System.out.println(balance);

        System.out.println("-------------");


        double salary= 45000;
        salary *= 2;

        System.out.println(salary);

        salary *= 3;
        System.out.println("salary = " + salary);

        System.out.println("-------------");

        double eth= 4;
        eth *= 250;
        System.out.println(eth);

        // division assigment operators
        eth /= 2;
        System.out.println(eth);

        // remainder

        int b=39;
        b%=7;
        System.out.println(b);















    }
}
