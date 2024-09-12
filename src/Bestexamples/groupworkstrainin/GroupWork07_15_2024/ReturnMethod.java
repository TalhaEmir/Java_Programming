package Bestexamples.groupworkstrainin.GroupWork07_15_2024;

public class ReturnMethod {

    public static void main(String[] args) {
        System.out.println(sum(2,5));
        int summarize=sum(2,5);


//return type has to match with result also exiting method
    }

    public static int sum(int num1, int num2) {
        int result;
        result = num1 + num2;
        return result;


    }
}
