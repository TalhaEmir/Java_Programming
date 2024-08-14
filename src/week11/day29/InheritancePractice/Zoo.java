package week11.day29.InheritancePractice;

public class Zoo {

    public static void main(String[] args) {
      System.out.println("=========Before //before //getClass().getSimpleName() +\"{\" +===============");              //before //getClass().getSimpleName() +"{" +

        Dog dog= new Dog("Max","K9",'F',3,"Medium","Black and White");
        System.out.println(dog);//Animal{name='null', breed='null', gender= , age=0, size='null', color='null'}


        System.out.println("=========After //before //getClass().getSimpleName() +\"{\" +===============");              //before //getClass().getSimpleName() +"{" +
        Dog dog1= new Dog("Leylos","Black",'F',3,"Small","Black and White");
        System.out.println(dog);//Dog{name='null', breed='null', gender= , age=0, size='null', color='null'}


        Cat cat=new Cat("Felicia","Stray",'F',3,"Medium","Black and White");
        System.out.println(cat);//Cat{name='null', breed='null', gender= , age=0, size='null', color='null'}




        Tiger tiger=new Tiger("Felicia","Stray",'F',3,"Medium","Black and White");
        System.out.println(tiger);//Tiger{name='null', breed='null', gender= , age=0, size='null', color='null'}


        System.out.println("=========================================");
        // inherited
        dog.eat();
        dog.sleep();
        dog.drink();


        cat.eat();
        cat.drink();
        cat.sleep();

        tiger.eat();
        tiger.drink();
        tiger.sleep();

        System.out.println("=========================================");

        dog.bark();
        /*
        cat.bark();// bug
        tiger.bark();
*/
      dog.setGender('M');
      System.out.println(dog.getGender());

    }

    }

