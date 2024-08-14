package MurodilSessions.week07intervievalso;

public class DivideWithouth {
    public static void main(String[] args) {
//while loop review
        int i= 1;

       while(i<=5){
           System.out.println(i +"");//1 //2 // 3 //4
           i++;
       }

        System.out.println("===================");
       int num1=10;
       int num2=5;
       int count=0;

      while(num1>=num2){
           num1-= num2; //7-4-1
           // num1= num1-num2;
           count++;
       }
        System.out.println(" count= " + count + " remainder= " + num1);






    }
}
