package WEEK13.DAY33.Shorts;

public class Fish extends Animal {
    public Fish(String name, String breed, int age, String size) {
        super(name, breed, age, size);
    }

    public void eat(){
        System.out.println("Fish" + name + "is eating dog food");
    }
}
