package week14.Day37.TryCatchBlock;

public class TryCatchBlock2 {
    public static void main(String[] args) {


        System.out.println("Program1 Started");


        int [] arr={1,2,3,4};

        try{
            System.out.println(arr[1000]);
        }catch(RuntimeException e){
            e.printStackTrace();// display the full details of the exception after the execution of program

        }


        System.out.println("Program1 ended");

        System.out.println("===================================================================");


        System.out.println("Program2 started");



        try{
            System.out.println(9/0);
        }catch(RuntimeException e){
            //e.printStackTrace();
            System.out.println(e.getMessage());

        }



        System.out.println("Program2 ended");





    }

}
