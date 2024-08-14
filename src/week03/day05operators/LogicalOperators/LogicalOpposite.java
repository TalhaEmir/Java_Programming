package week03.day05operators.LogicalOperators;

public class LogicalOpposite {

    public static void main(String[] args) {
        // logical not operator

        System.out.println(!true);

        String a= "yes";

        boolean yes= a=="yes";
        boolean no= !true; //false

        System.out.println("yes =" + yes );
        System.out.println("no = " + no);

        System.out.println("==============");

        int score= 65;
        boolean passed= score >= 60;
        boolean failed= !passed;

        System.out.println(passed);
        System.out.println(failed);

        System.out.println("failed  =" + failed);
        System.out.println("passed  ="+ passed);
        System.out.println(true== !false && false== !true && true!=!true );
                            // true + true+ false





    }
}
