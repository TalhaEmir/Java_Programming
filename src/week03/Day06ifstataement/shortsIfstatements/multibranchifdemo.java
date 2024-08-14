package week03.Day06ifstataement.shortsIfstatements;

public class multibranchifdemo {

   // wrtite a program that can check if the given number is positive, negative or zero
   public static void main(String[] args) {
       int num= 10;
        String Result="";

       if (num > 0) {
           Result= "Positive";
       } else if (num < 0) {
           Result="Negative";
       }else {
           Result="Zero";
       }
       System.out.println(Result);
   }


}
