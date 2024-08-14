package week07.day17CustomClass;

public class    Student {


    public String name;
    public int age;
    public char gender;
    public String course;
    public String major;

    public void identifyClass(String name, int age, char gender, String course, String major) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.course = course;
        this.major = major;

    }


    public void represent() {
        System.out.println(name + " present this lesson ");
    }

    public void study(){
        System.out.println(name + " is studying ");
    }


    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", course='" + course + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
