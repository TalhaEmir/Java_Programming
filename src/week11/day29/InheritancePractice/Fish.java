package week11.day29.InheritancePractice;

public class Fish extends Animal {
    public Fish(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void swim(){
        System.out.println(getName() + " is swimming");
    }
}
