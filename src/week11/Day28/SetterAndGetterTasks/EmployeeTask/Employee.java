package week11.Day28.SetterAndGetterTasks.EmployeeTask;

public class Employee {


    private double salary;
    private String name;
    private int age;
    private String jobTitle;

    public Employee(double salary, String name, int age, String jobTitle) {
        setSalary(salary);
        setName(name);
        setAge(age);
        setJobTitle(jobTitle);

    }


    public int getAge() {
        return age;
    }



    public void setAge(int age) {
        if(age<16){
            System.err.println("Invalid age : " + age);
            System.exit(1);
        }
        this.age = age;
    }



    public String getJobTitle() {
        return jobTitle;
    }




    public void setJobTitle(String jobTitle) {

        if(jobTitle.isEmpty() || jobTitle.isBlank()){
            System.err.println("JobTitle can not be a empty or blank : " + jobTitle);
            System.exit(1);
        }
        this.jobTitle = jobTitle;
    }




    public String getName(){
        if(name==null){
            return "Unknown";
        }
        return name;
    }

    public void setName(String name){
        if(name.isEmpty() || name.isBlank()){
            System.err.println("Employee name is can not be a empty or blank" + name);
            System.exit(1);
        }
        this.name=name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        if(salary<0){
            System.err.println("Salary can not be less than 0, invalid salary= "+ salary);
            System.exit(1);
        }
        this.salary=salary;
    }










    public String toString() {
        return "Employee{" +
                "salary=" + getSalary() +
                ", name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", jobTitle='" + getJobTitle() + '\'' +
                '}';
    }
}
