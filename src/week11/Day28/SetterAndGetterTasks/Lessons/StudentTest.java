package week11.Day28.SetterAndGetterTasks.Lessons;

public class StudentTest {

    public static void main(String[] args) {
        Student student= new Student();
        // student.age=-200;
        //System.out.print;n(student.age)


        //System.out.println(student.getAge());//0
        // if we didnt assign any number with setter getter gonna get 0


        student.setAge(25);


        System.out.println(student);//week11.Day28_encapsulation.Student@6acbcfc0


        System.out.println(student.getAge());//11


        // student.setName("Aaron");
        System.out.println(student.getName());




        Student student1=new Student();
        student1.setAge(18);
        System.out.println(student1.getAge());//18
        student1.setName("Talha94");
        System.out.println(student1.getName());//Invalid name;Talha94





    }
}

