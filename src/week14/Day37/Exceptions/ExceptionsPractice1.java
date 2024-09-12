package week14.Day37.Exceptions;

public class ExceptionsPractice1 {
    public static void main(String[] args) {
        System.out.println("Program started");


        String str="null";


        try {
           // System.out.println(str.charAt(-20));
            //System.out.println(20/0);
            System.out.println(str.charAt(100));

        } catch(ArithmeticException e){
            System.out.println("Arithmetic exception has occured");
        }catch(IndexOutOfBoundsException e) {
            System.out.println("Index out of bound exception has occured");
            System.exit(0);

        } catch(RuntimeException e) {

       //e.printStackTrace();
           System.out.println("An unchecked exception has occured");


        }finally{
            System.out.println("Finally!!");
        }


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("Program completed");







    }
}
