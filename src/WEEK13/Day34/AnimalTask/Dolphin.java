package WEEK13.Day34.AnimalTask;

public class Dolphin extends Animal implements Playable,Swimmable {
    public Dolphin(String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender,age,size,color);
    }

    public void eat(){
        System.out.println("Dolphin " + getName() + " eating fish");
    }

    public void play(){
        System.out.println("Dolphin" + getName() + "playing with ball");
    }
    public void swim() {

    }
}
