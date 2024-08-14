package week11.day29.InheritancePractice;

public class Dog extends Animal{
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }


    public void eat() {
        System.out.println("Dog" + getName() + "is eating dog food");
    }

    // dog is animal // dog is child
    public void bark(){
        System.out.println(getName() + " is barking");
    }



/*
    public void method(){
        System.out.println(name);
        System.out.println(breed);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(size);
        System.out.println(color);
        System.out.println(isAnimal);
        setInfo();
        eat();



    }
*/

/*

7 variables inherited
5 methods
 */


}
