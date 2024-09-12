package WEEK13.DAY33.Shorts;

public abstract class Animal {

    public String name, breed;
    public int age;
    public String size;

    public Animal(String name, String breed, int age, String size) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.size = size;
    }

    public abstract void eat();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", size='" + size + '\'' +
                '}';
    }
}
