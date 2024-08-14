package week07.day17CustomClass;

public class StudentObject {


    public static void main(String[] args) {

        Student student1 = new Student();
        student1.identifyClass("Sevinc",28,'m',"math","Logical" );
        Student student2 = new Student();
        student2.identifyClass("Talha", 34, 'm',"sociology","Logical" );
        Student student3 = new Student();
        student3.identifyClass("Cemre", 28, 'f',"math","Logical" );
        Student student4 = new Student();
        student4.identifyClass("Enes", 28, 'f',"teach","Logical" );

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);
        System.out.println(student4);














    }
}
