package week10.Day26.Constructors;

public class ConstructorsCall2 {


    public ConstructorsCall2(){
        System.out.println("Default");//Default

    }

    public ConstructorsCall2(int a){//Default  int arg
        this();// it calls the default constructor
        System.out.println("int arg");
    }

    public ConstructorsCall2(String a){
        this(10);
        System.out.println("String arg");
    }

    public static void main(String[] args) {
        ConstructorsCall2 obj1= new ConstructorsCall2();

        System.out.println("========================");

        ConstructorsCall2 obj2= new ConstructorsCall2(10);//Default  int arg

        System.out.println("========================");

        ConstructorsCall2 obj3= new ConstructorsCall2("a");//Default  int arg String arg





    }

}
