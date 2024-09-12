package WEEK13.day35.Polymorphism;

import WEEK13.day35.Animal.Animal;
import WEEK13.day35.Animal.Cat;
import WEEK13.day35.Animal.Dog;

public class Polymorphism {
    public static void main(String[] args) {
       Animal animal1= new Dog("Max","Husky",'M',5,"BIG","GREY");
       //animal1.bark(); wrong reference type is parent class
        animal1.eat();//DOG Max eating seed

        Animal animal2= new Cat("Lucy","Bengal",'M',11,"Large","wHITE");
        animal2.eat();//CatLucyeating mice

       // animal2.meow();




    }
}
