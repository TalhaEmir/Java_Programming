package Tekrar.Days.week10.Days25;

public class Student {

    public String name;
    public int age;
    public String gradeLevel;

    public static String schoolName;// if there is more than one step to give value you can not put = sign
    public static String secretCode;
// or


    public Student(){
        // System.out.println("Constructor");// it can take arguments
        //        //but without any object it is not gonna execute
        //        //constructor can not get it any arguments
        //static veya

    }
    static{
        schoolName="Cydeo";
        secretCode="Wooden Spoon";
    }


    public Student(String name) {
        this.name = name;
    }
    public Student(int age) {
        this.age = age;
    }
    public Student(String name, int age) {
        this(name);
        this.age = age;
    }

    public Student(String name, int age, String gradeLevel) {
        this.name = name;
        this.age = age;
        this.gradeLevel = gradeLevel;
    }

    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gradeLevel='" + gradeLevel + '\'' +
                '}';
    }
}
