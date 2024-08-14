package week11.day29.InheritancePractice;

public class Animal {

    public Animal(String name, String breed, char gender, int age, String size, String color) {
        this.name = name;
        this.breed = breed;
        this.gender = gender;
        this.age = age;
        this.size = size;
        this.color = color;
    }

    // neden constructor yapmiyoruz cunku constructor sinifin adiyla kueruluyor biz dog sininfda Animall class adiyla consturcotr kuramayiz
    private String name;
    private String breed;
    private char gender;
    private int age;
    private String size;
    private String color;
    private static boolean  isAnimal;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    static{
        isAnimal=true;
    }



    public void eat(){
        System.out.println(name + "is eating");

    }

    public void drink(){
        System.out.println(name + " is drinking water");

    }

    public void move(){
        System.out.println(name + " is moving");
    }

    public void sleep(){
        System.out.println(name + " is sleeping");
    }

    public void bark(){
        System.out.println(name + " is barking");
    }


    public String toString() {
        return getClass().getSimpleName() + // burada bunun yerine yani animalin yerine class name ko
                "name='" + getName() + '\'' +
                ", breed='" + getBreed() + '\'' +
                ", gender=" + getGender() +
                ", age=" + getAge() +
                ", size='" + getSize() + '\'' +
                ", color='" + getColor() + '\'' +
                " is animal" + isAnimal +
                '}';
    }
}
