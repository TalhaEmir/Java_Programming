package week10.Day25.WarmUp;
import java.time.LocalDate;
public class Person {

    public String name;
    public int age;
    public char gender;
    public LocalDate dateOfBirth;

    public void setInfo(String name, char gender, LocalDate dateOfBirth) {
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.age= LocalDate.now().getYear()-dateOfBirth.getYear();

    }



    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}
