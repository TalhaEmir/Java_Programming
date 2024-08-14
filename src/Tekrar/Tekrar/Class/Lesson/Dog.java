package Tekrar.Tekrar.Class.Lesson;

public class Dog {// class

    public String name,breed,color;
    public int age;
    public char gender;

public void eat(){
    //with the object you can call

    System.out.println(name + "is eating dog food");
}

public void sleep(){
    System.out.println(name + "is sleeping");

}


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
