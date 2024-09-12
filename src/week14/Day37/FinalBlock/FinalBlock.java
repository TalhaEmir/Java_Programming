package week14.Day37.FinalBlock;

public class FinalBlock {
    public static void main(String[] args) {




        try{
            System.out.println(9/0);
        }catch(NullPointerException e){
            System.out.println("Run time exception has been caught");
        }finally{
            System.out.println("Finally Block");
        }
    }
}
