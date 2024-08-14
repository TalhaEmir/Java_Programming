package practice;

public class Dog {
    // instance variables
public String name;

public String breed;

public int age;

public char gender;



public void eat(){ // method also can called function/ instance method we dont have static
    System.out.println(name + " is eating dog food");

}

public void sleep(){
    System.out.println(name + " is sleeping");

}

    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
