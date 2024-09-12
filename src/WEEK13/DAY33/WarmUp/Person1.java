package WEEK13.DAY33.WarmUp;

import java.time.LocalDate;

public class Person1 {
    private String name;
    private final char gender;
    private final int age;
    private final LocalDate dateOfBirth;

    public Person1(String name, char gender, LocalDate dateOfBirth ) {
        setName(name);
        if(!(gender=='M' || gender=='F')){
            System.out.println("Wrong gender " + gender);
        }
        this.gender=gender;
        this.dateOfBirth=dateOfBirth;
        this.age=LocalDate.now().getYear()-dateOfBirth.getYear();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void drink() {
        System.out.println(name + " is drink");

    }


    public void eat() {
        System.out.println(name + " is eating");
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
