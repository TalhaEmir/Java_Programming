package WEEK13.Day34.AnimalTask;

public class Tiger extends Animal implements WildAnimal {
    public Tiger(String name, String breed, char gender, int age, String size, String color){
        super(name,breed, gender, age, size, color);
    }

    public void eat(){
        System.out.println("Tiger " + getName() + " eating buffalo");
    }

    public void hunt() {

    }
}
