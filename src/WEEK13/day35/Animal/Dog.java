package WEEK13.day35.Animal;

public class Dog extends Animal implements Playable, Swimmable {
    public Dog(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println("DOG " + getName() + " eating seed");

    }

    @Override
    public void play() {
            System.out.println("Duck" + getName() + "playing with puff");
    }


    public void swim() {

    }
}
