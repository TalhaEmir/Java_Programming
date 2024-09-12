package week14.Day37.TryCatchBlock;

public class TryCatchBlock {

    public static void main(String[] args) {





        System.out.println("Program Started");


        try {
            System.out.println(9 / 0);// Arithmetic Exception
            System.out.println("Try Block");
        }catch(ArithmeticException e){

            System.out.println("Catch Block");


        }


        System.out.println("Program Ended");


        System.out.println("=======================================================================");



String str= null;

try {
    System.out.println(str.toLowerCase());
    System.out.println("Try Block");

}catch(RuntimeException e){
    System.out.println("Catch Block");
}



        System.out.println("Program Ended");






        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println("=======================================================================");

System.out.println("Program started");


try {
    Thread.sleep(3000);
    System.out.println("Program started");
    System.out.println("Try Block");

}catch(InterruptedException e){
    System.out.println("Catch Block");
}

        System.out.println("Program ended");


    }
}
