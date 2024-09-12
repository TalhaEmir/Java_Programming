package WEEK13.day35.PolymorphismIntro;

import WEEK13.Day34.WarmUp.Honda;

import java.util.Arrays;

public class PolymorphismIntro {

    public static void main(String[] args) {
        Dog dog = new Dog("Max", "Husky", 'M', 4, "Small", "White");
        Cat cat = new Cat("Max", "Husky", 'M', 4, "Small", "White");

        Tiger tiger = null;

        Eagle eagle = null;

        Lion lion = null;

        Parrot parrot = null;

        Duck duck = null;

        Dolphin dolphin=null;
        Shark shark=null;



        Animal[] animals = {dog, cat, tiger, lion,eagle,parrot,dolphin, shark,duck};

        Animal animal= new Dog("Max", "Husky", 'M', 4, "Small", "White");

        animal.eat();
        animal.drink();
        animal.sleep();

       // animal.play();
       // animal.bark();

        System.out.println("=========================================");


        String str="Java";
        Integer n=100;
        Boolean r = false;
        Double d= 10.5;
        Honda honda=new Honda("Honda","A8",2014,750000);
        Tesla tesla=new Tesla("Honda","A8","grey",2014,750000);

        Object[] object={str, n,r,d,honda,tesla};
        System.out.println(Arrays.toString(object));//[Java, 100, false, 10.5, Honda{ model is Hondacolor is A8year is 2014price is 750000.0}, Tesla{ model is A8 color is grey year is 2014 price is 750000.0}]






    }

}


