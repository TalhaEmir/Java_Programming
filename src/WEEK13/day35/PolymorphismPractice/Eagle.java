package WEEK13.day35.PolymorphismPractice;

public class Eagle extends Animal implements Flyable, WildAnimal {
    public Eagle(String name, String breed, char gender, int age, String size, String color){
        super(name, breed,gender,age,size,color);
    }

    public void eat(){
        System.out.println("Eagle " + getName() + " eating fish");
    }

    public void fly(){

    }

    public void hunt() {

    }
}
