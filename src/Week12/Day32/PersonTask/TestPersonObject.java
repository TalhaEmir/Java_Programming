package Week12.Day32.PersonTask;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Person person= new Person("Daniel",'M', LocalDate.of(1991,1,25) );
        Employee employee= new  Employee("Emily",'M', LocalDate.of(1991,1,25),"Java Developer",100000 );

        System.out.println(person);

        System.out.println(employee);


       employee.breath();


    }


}
