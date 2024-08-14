package week10.Day27.LONG;

public class InstanceBlock {





    public InstanceBlock(){
        System.out.println("Constructor");
    }

    {
        System.out.println("Instance Block");

        //Instance Block always executed before Constructor
    }

    public static void main(String[] args) {

new InstanceBlock();//Constructor
new InstanceBlock();
new InstanceBlock();


    }
}
