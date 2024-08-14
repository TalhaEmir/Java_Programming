package week10.Day27.LONG;

public class TestCydeoObject {
    public static void main(String[] args) {


        System.out.println(  CydeoStudent.schoolName);//Cydeo

        CydeoStudent student1= new CydeoStudent("Ekaterina",29,'F');
        CydeoStudent student2= new CydeoStudent("Alena",28,'F');
        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student1.schoolName);// it is not legal we dont like it like that
        System.out.println(student2.schoolName);

        System.out.println(student1.secretCode);
        System.out.println(student2.secretCode);

        //you have to call static through the class not the object







    }
}
