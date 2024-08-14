package week10.Day26.Constructors;

public class ConstructorsCalls {
    //rules//

    // 1 they are special methods.
    // 2 Contructors can not be called it's name --this() --need to be used
    //3 this; refers to instances
    //4 this.:to call instance variables& instance methods and
    // this() used for calling constructors in another constructor
    //but using this(); we can call constructors. Only a constructor call another constructor with this()
    // Constructors call MUST be at the first step if they are at others constructors (first inside second with -this()
    // but first constructors you can use below or above others constructors

    // 5 no return type at constructor
//6 you can not call first one at second one

    //7you can not call more than one constructor another constructor body
    //8- constructors you dont need to call every (field). like  public String make,model;
    //
    //    public int year;
    //
    //    public double price;
    //
    //    public String color;

    public ConstructorsCalls(){
        System.out.println("Default constructor");
    }

    public ConstructorsCalls(int a){
        // public ConstructorsCalls() you can not call first one at second one
        this();
        System.out.println("Constructor with int argument");
    }


    public ConstructorsCalls(double a){
        System.out.println("Default constructor with double argument");
    }


    public ConstructorsCalls(String c){
        this(2.5);
        //this(); you can not call more than one constructor another constructor body

        System.out.println("Default constructor with string argument");
    }


    public static void main(String[] args) {

        method1();//Method1

        System.out.println("========================");
        method2();//Method1 Method 2

    }
    public static void method1(){
System.out.println("Method1");

    }


    public static void method2(){

        method1();
        System.out.println("Method 2");


    }



}
