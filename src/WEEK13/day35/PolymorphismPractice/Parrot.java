package WEEK13.day35.PolymorphismPractice;

public class Parrot extends Animal implements Playable, Flyable {
    public Parrot(String name, String breed, char gender, int age, String size, String color){
        super(name,breed,gender,age, size, color);
    }


    public void eat(){
        System.out.println("Parrot " + getName() + " eating seed");
    }



    public void play(){
        System.out.println("Duck" + getName() + "playing with puff");
    }


    public void fly(){

    }

}
