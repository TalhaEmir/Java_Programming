package WEEK13.day35.LastTasks;

public abstract class Employee {

    private String name;
    private  int age;
    private char gender;
    private String id;
    private String jobTitle;
    private double salary;

    public Employee(String name,int age, char gender, String id, String jobTitle, double salary) {
        setName(name);
       setId(id) ;
       setJobTitle (jobTitle);
       setAge(age);
       setGender(gender);
        setSalary(salary);
    }

    public abstract void work();// abstract method incomplete method


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
