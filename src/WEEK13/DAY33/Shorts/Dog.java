package WEEK13.DAY33.Shorts;

public class Dog extends Animal {
    public Dog(String name, String breed, int age, String size) {
        super(name, breed, age, size);
    }



    public void eat(){
        System.out.println("Dog" + name + "is eating dog food");
    }



}
