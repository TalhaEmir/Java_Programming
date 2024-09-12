package WEEK13.DAY33.Employee;

import java.time.LocalDate;

public class Teacher extends Employee {
    public Teacher(String name, String id, String jobTitle, int age, char gender, double salary) {
        super(name,id,jobTitle,age,gender,salary);
    }
    public void work() {
        System.out.println(getName() + " is teaching");
    }


}
