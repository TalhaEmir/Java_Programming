package week10.Day26.StudentTask;

public class Student {
    public String name;
    public int age;
    public char gender;
    public String id;


    public Student(String name, int age, char gender, String id) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.id = id;
    }// burada this kullaniyiruz cunku it is global



    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", id='" + id + '\'' +
                '}';
    }


    public void study(){
        System.out.println(name + "is studying" );// buarada this kullanmiyoruz cunku name global variable
    }
}
/*1. Create a custom class named Student
            Attributes:
                name, age, gender, id

            Add a constructor that can set all the fields

            Methods:
                study()
                toString()*/
