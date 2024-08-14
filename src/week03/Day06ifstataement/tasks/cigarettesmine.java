package week03.Day06ifstataement.tasks;

public class cigarettesmine {

    public static void main(String[] args) {

        int age=20;
        String result="";

        if (age>=18){
            result="You are eligible to buy cigarettes";
        }else{
            result="You are not eligible to buy cigarettes";
        }
        System.out.println(result);
    }
}
