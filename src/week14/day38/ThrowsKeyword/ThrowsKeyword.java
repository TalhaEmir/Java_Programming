package week14.day38.ThrowsKeyword;

public class ThrowsKeyword {

    public static void main(String[] args){
        System.out.println("Program Started");


        try {
            System.out.println(9/0);
            System.out.println("Program trying");
        } catch (Exception e) {
            System.out.println("Program ctching");
            throw new RuntimeException();
        }
        method2();
      method3();

        System.out.println("Program Ended");


    }


    public static void method1()throws Exception{
        Thread.sleep(3000);
        System.out.println("Wooden Spoon");
    }


    public static void method2(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Cydeo School");
    }


    public static void method3()throws RuntimeException{
       throw new RuntimeException("final round");
    }
}
