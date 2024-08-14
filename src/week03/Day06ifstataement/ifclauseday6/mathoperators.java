package week03.Day06ifstataement.ifclauseday6;

public class mathoperators {

    public static void main(String[] args) {


    double n1=10.5;
    double n2=20.5;
   char operator= '+';
   double result=0;



   if(operator=='+'){
       result= n1 + n2;

   }else if(operator=='-'){
    result= n1 - n2;

   }else if(operator=='*'){
       result= n1 * n2;
   }else if(operator=='/'){
       result= n1 / n2;
   }

   System.out.println(result);







    }

}
