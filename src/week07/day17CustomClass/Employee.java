package week07.day17CustomClass;

public class Employee {


    public String name;
    public int age;
    public char gender;
    public String jobTitle;
    public double salary;
    public String id;
// bunlar genelde global variable class seviyesinde instance variable ve objecte aittir

    public void setInfo(String name, int age, char gender, String jobTitle, double salary, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.id = id;

    }

    //sets all the attributes of the Employees object at once

    public String toString() {// to avoid getting hash code when we print employeee object
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", id='" + id + '\'' +
                '}';
    }

    public void work(){
        System.out.println(name+ "is working");

    }



}
