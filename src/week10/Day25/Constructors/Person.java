package week10.Day25.Constructors;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Person {
public String name;
public int age;
public LocalDate dateOfBirth;
public boolean isMarried;
public boolean isEmployed;

    public Person(String name) {

        this.name = name;
    }

    public Person(String name,int age){
       this(name);// yukaridaki constructiona delalet ediyor
        this.age=age;
        // you can not do here should be first  this(name);

    }



    public Person(String name, int age, LocalDate dateOfBirth, boolean isMarried, boolean isEmployed) {
        this.name = name;
        this.age = age;
        this.dateOfBirth = dateOfBirth;
        this.isMarried = isMarried;
        this.isEmployed = isEmployed;
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", dateOfBirth=" + dateOfBirth.format(DateTimeFormatter.ofPattern("MMMM/dd/y")) +
                ", isMarried=" + isMarried +
                ", isEmployed=" + isEmployed +
                '}';
    }

    public void eats(String food){
        System.out.println(name+ " eating "+ food);

    }

    public void drinks(String drink){
        System.out.println(name+" drinking " +drink);

    }

}


/*

5 person object
name,age,gender, dateOfBirth, isMarried, isEmployed

Add a constructor that can set all the fields once and object is created

toString(), eat(food), sleeping(),drink (String drink)
 */