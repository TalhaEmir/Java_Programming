package week10.Day25.WarmUp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class TestPersonObjective {
    public static void main(String[] args) {
        Person[] people = { new Person(), new Person(), new Person(), new Person(), new Person() };
        people[0].setInfo("Daniel", 'M', LocalDate.of(1989, 2, 25));
        people[1].setInfo("Efe", 'M', LocalDate.of(1992, 3, 24));
        people[2].setInfo("Hayden", 'M', LocalDate.of(1975, 4, 25));
        people[3].setInfo("Talha", 'M', LocalDate.of(2000, 6, 29));
        people[4].setInfo("Murodil", 'M', LocalDate.of(1900, 6, 29));

        System.out.println(Arrays.toString(people));

        System.out.println("1===============================");


/* public void setInfo(String name, char gender, LocalDate dateOfBirth) {
            this.name = name;
            this.gender = gender;
            this.dateOfBirth = dateOfBirth;
            age = LocalDate.now().getYear() - dateOfBirth.getYear();
        }*/


        ArrayList<Person> studentsList = new ArrayList<>();
        studentsList.addAll( Arrays.asList(people) );
        System.out.println(studentsList);

        System.out.println("2===============================");

        // remove all the person object that has the age > 40//without loop
        studentsList.removeIf(p->p.age>40);
        System.out.println(studentsList);

        System.out.println("3===============================");



        // print name & date of birth of each person object

        // print name& date of birth


        // remove all the person object that has the age > 40


    }

}

