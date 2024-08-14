package week11.Day30.TypesOfInheritance;

import java.time.LocalDate;

public class TestPersonObject {
    public static void main(String[] args) {

        Student student= new Student("Lucy", 'F', LocalDate.of(1990,5,16), 'A', "101");
        System.out.println(student);

        System.out.println("==============================================");

        President president= new  President("Arnold",'M',LocalDate.of(1990,5,16),LocalDate.of(1985,5,16));
        System.out.println(president);

        System.out.println("==============================================");

        Teacher teacher = new Teacher("Bokterem",'F', LocalDate.of(1985, 11, 1), "Math Teacher", "C1", 95000);
        System.out.println(teacher);





        student.study();
        teacher.teach();
        president.lie();


        System.out.println("==============================================");

        teacher.eat("Baklava");
        student.eat("Kebap");
        president.eat("Donut");

        student.drink("milk");
        student.drink("su");

    }

}
