package Tekrar.Tekrar.Class.Lesson;

public class DogObject {
    public static void main(String[] args) {

        Dog dog1=new Dog();// same package we dont need to import
        Dog dog2=new Dog();

        dog1.name="Max";


        dog1.eat();
        dog2.eat();
        dog2.name="Max";
        dog2.breed="German Shepperd";
        dog2.age=12;

        System.out.println(dog2);//Dog{name='Max', breed='German Shepperd', color='null', age=12, gender= }






    }
}
