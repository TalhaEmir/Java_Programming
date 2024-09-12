package WEEK13.day35.LastTasks;

public class Driver extends Employee {
    public Driver(String name, int age, char gender, String id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void work() {
        System.out.println(getName() + " is driving");
    }
}
