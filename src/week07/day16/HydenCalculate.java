package week07.day16;

public class HydenCalculate {

    public static double calculate(double n1, char operator, double n2){
        return switch (operator){
            case '+' -> n1 + n2;
            case '-' -> n1 - n2;
            case '*' -> n1 * n2;
            case '/' -> n1 / n2;
            case '%' -> n1 % n2;
            default -> 0;
        };
    }
}
