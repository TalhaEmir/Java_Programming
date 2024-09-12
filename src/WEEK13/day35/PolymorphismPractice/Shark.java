package WEEK13.day35.PolymorphismPractice;

public class Shark extends Animal implements WildAnimal, Swimmable {
    public Shark(String name, String breed, char gender, int age, String size, String color){
        super(name, breed,gender,age,size,color);

    }

    public void eat(){
System.out.println("Shark " + getName() + " eating fish");
    }

    public void hunt() {

    }

    public void swim() {

    }
}
