package WEEK13.Day34.AnimalTask;

public class Cat extends Animal implements Playable {
    public Cat(String name, String breed, char gender, int age, String size, String color){
        super(name, breed,gender,age,size,color);
    }

    public void eat(){
        System.out.println("Cat" + getName() + "eating mice");
    }


    public void play() {
        System.out.println("Cat" + getName() + "playing with puff");


    }

}
