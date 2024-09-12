package WEEK13.day35.PolymorphismPractice;

public class Duck extends Animal implements Playable, Swimmable {
    public Duck(String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender, age, size,color);
    }

    public void eat(){
        System.out.println("Duck " + getName() + " eating bugs");
    }


    public void play(){
        System.out.println("Duck" + getName() + "playing with puff");
    }


    public void fly(){

    }

    public void swim() {

    }

}
