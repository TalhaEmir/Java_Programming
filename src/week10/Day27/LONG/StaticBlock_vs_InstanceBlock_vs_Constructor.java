package week10.Day27.LONG;

public class StaticBlock_vs_InstanceBlock_vs_Constructor {

    public StaticBlock_vs_InstanceBlock_vs_Constructor(){
        System.out.println("Constructor");// it can take arguments
        //but without any object it is not gonna execute
        //constructor can not get it any arguments
    }

    {
       System.out.println("Instance Block");
       // instance block can not get any arguments
    }

    static{
        System.out.println("Static Block");
    }


    public static void main(String[] args) {

        System.out.println("Main Method");
        new StaticBlock_vs_InstanceBlock_vs_Constructor();// her bir obje icin hem constructor hem de instance block
        new StaticBlock_vs_InstanceBlock_vs_Constructor();// her bir obje icin hem constructor hem de instance block

    }

}
