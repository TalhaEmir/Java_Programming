package WEEK13.DAY33.Shorts;

public class Cat extends Animal{
    public Cat(String name, String breed, int age, String size) {
        super(name, breed, age, size);
    }

    public void eat(){
        System.out.println("Cat" + name + "is eating dog food");
    }

}
