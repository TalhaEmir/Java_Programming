package week04.day08.tasks;

public class BiggerNum {

    public static void main(String[] args) {

        int num1=1;
        int num2=2;
        int num3=3;

        String result= (num1>num2 && num1>num3)?"n1 is the bigger":(num2>num1 && num2>num3)?"num2 is the bigger":"num3 is the bigger";

        System.out.println(result);

    }
}
