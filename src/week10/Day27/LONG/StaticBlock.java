package week10.Day27.LONG;

public class StaticBlock {

public StaticBlock(){//"Constructor"
    System.out.println("Constructor");
    // constructor her seferinde yazdirir

}

    public static void main(String[] args) {
        System.out.println("Main Method");


        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }

    static{// it always printed first and just one time // its only executed one time
        System.out.println("Static Block");
    }


}
