package Week12.Day31.Animal_MethodOverriding;

public class TestAnimalObjects {
    public static void main(String[] args) {


        Cat cat=new Cat("Emily", "Bengal" , 'F' ,4 , "Small" , "Gray");
        Dog dog=new Dog("MAX", "Husky" , 'M' ,3 , "Large" , "White");
        Lion lion=new Lion("Simba", "African Leon" , 'M' ,3 , "Large" , "White", true);
        Eagle eagle= new Eagle("Bella", "American Eagle",'F',4,"Medium", "Black and White");


        System.out.println("=============================================================");

        System.out.println(cat);
        cat.eat();
        cat.sleep();

        System.out.println("=============================================================");


        System.out.println(dog);
        dog.eat();
        dog.sleep();

        System.out.println("=============================================================");

        System.out.println(lion);
        lion.eat();
        lion.sleep();
        System.out.println("=============================================================");

        System.out.println(eagle);
        eagle.eat();
        eagle.sleep();
        System.out.println("=============================================================");





    }
}
