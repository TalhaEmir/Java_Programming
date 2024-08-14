package week10.Day25.Constructors;

public class ConstructorsIntro {

    //real Constructor doesn't have return type
    //Constructor should have Parameterized or No Argument


    public ConstructorsIntro(){//default instructor
        System.out.println("Object is created by using using default constructor");

    }


   /* public ConstructorsIntro(double a){ // only constructure we created this one and we used this one
        System.out.println("Object is created by using int argument constructor");
    }
*/


    public ConstructorsIntro(int a){ // only constructure we created this one and we used this one
    System.out.println("Object is created by using int argument constructor");
    }


    public void add(){ //instance method becuase void is return type

    }




    public static void main(String[] args) {

        ConstructorsIntro obj1=new ConstructorsIntro(10);
        ConstructorsIntro obj2=new ConstructorsIntro();
        ConstructorsIntro obj3=new ConstructorsIntro();
    }
}
