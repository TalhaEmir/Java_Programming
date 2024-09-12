package week14.Day36.ReferenceTypeCasting.Animals;

public class Cat extends Animal {
    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }
    //cat is animal




    public void scratch(){
        System.out.println(getName() + " is scratching");
    }


    public void meow(){
        System.out.println(getName() + " is meowing");
    }

    public void eat(){
        System.out.println("Cat" + getName() + "is eating");




    }
}
