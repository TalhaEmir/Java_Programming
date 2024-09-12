package WEEK13.DAY33.Employee;

public class Driver extends Employee{
    public Driver(String name, String id, String jobTitle, int age, char gender, double salary) {
        super(name, id, jobTitle, age, gender, salary);
    }

    public void work() {
        System.out.println(getName() + " is driving");
    }
}
