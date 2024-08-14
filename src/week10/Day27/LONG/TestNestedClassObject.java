package week10.Day27.LONG;

public class TestNestedClassObject {
    public static void main(String[] args) {

        Car obj1= new Car();// car object
        Car.carEngine obj2=obj1.new carEngine ();// carEngine object

        new Car.StaticInnerClass();// for inner class we dont need any object for static inner class to use
        Car.StaticInnerClass obj3=new Car.StaticInnerClass();
    }

}
