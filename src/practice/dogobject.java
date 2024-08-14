package practice;

import java.sql.SQLOutput;

public class dogobject {
    public static void main(String[] args) {

        Dog dog1 = new Dog();


        dog1.name="Max";
        dog1.breed="German Shepperd";
        dog1.age=3;
        dog1.gender='M';


        Dog dog2 = new Dog();
        dog2.name="Lucy";
        dog2.breed="Husky";
        dog2.age=2;
        dog2.gender='F';


        System.out.println(dog1);




        System.out.println(dog1.name);
        System.out.println(dog2.name);




        dog1.eat();
        dog2.eat();




    }
}
