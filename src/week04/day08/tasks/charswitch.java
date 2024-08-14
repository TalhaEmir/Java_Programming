package week04.day08.tasks;

public class charswitch {

    public static void main(String[] args) {
        char ch='+';
        int num1=10;
        int num2= 20;
       String result="";

       switch(ch){
           case '+' :
               System.out.println(num1 + num2);
            break;
           case '-' :
               System.out.println(num2- num1);
             break;
             case '*' :
                 System.out.println(num2*num1);
             break;
             case '%' :
                 System.out.println(num2%num1);
           default: result="Error";
               System.out.println(result);
       }
    }
}
