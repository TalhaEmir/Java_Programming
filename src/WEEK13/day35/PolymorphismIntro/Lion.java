package WEEK13.day35.PolymorphismIntro;

public class Lion extends Animal implements WildAnimal {
    public Lion(String name, String breed, char gender, int age, String size, String color){
        super(name, breed, gender, age, size,  color);
    }
    public void eat(){
        System.out.println("Lion " + getName() + " eating deer");
    }

    public void hunt() {

    }

}
