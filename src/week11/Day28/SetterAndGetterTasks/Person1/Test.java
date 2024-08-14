package week11.Day28.SetterAndGetterTasks.Person1;

import java.time.LocalDate;

public class Test {

    public static void main(String[] args) {

        //LocalDate lateToday= LocalDate.of(2022,7,1);
        Person1 person1 = new Person1("Naile",35,'F', LocalDate.of(1985,6,13));
        System.out.println(person1);

        Person1 person2 =new Person1("Ibrahim",40,'M',LocalDate.of(2024,12,03));
        System.out.println(person2);

        System.out.println(LocalDate.now());
    }
}
