package week11.Day30.TypesOfInheritance;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Person {

    public Person(String name, char gender, LocalDate DOB) {
       setName(name);
       setGender(gender);
       setDOB(DOB);
       setAge(LocalDate.now().getYear()- DOB.getYear());
    }

    private String name;
    private int age;
    private char gender;
    private LocalDate DOB;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public LocalDate getDOB() {
        return DOB;
    }

    public void setDOB(LocalDate DOB) {
        this.DOB = DOB;
    }

    public void eat(String food){
        System.out.println(name+ " is eatinbg" + food);
    }

    public void drink(String drink){
        System.out.println(name+ "is drinking" + drink);
    }

    public String toString() {
        return getClass().getSimpleName() +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", DOB=" + DOB +
                '}';



    }
}
