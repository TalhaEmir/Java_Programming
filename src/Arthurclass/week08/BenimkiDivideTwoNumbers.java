package Arthurclass.week08;

public class BenimkiDivideTwoNumbers {

    public static void main(String[] args) {


        int n1=100;
        int n2=6;
        int count=0;

       while (n1>n2){
           n1-=n2;
           count++;
       }System.out.println("count=" +count + "remainder " + n1);

    }
}
