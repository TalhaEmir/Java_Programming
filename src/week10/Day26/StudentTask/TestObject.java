package week10.Day26.StudentTask;

import java.util.ArrayList;

public class TestObject {

    public static void main(String[] args) {


    Student student1 = new Student("Yusuf", 21, 'M', "A16");

    Student student2 = new Student("Glenio", 24, 'M', "B34");
    Student student3 = new Student("Sumeyye", 22, 'F', "C56");
    Student student4 = new Student("Mehmet", 25, 'M', "D43");
    Student student5 = new Student("Sebastian", 23, 'M', "E27");

    StudentsGroups group1= new StudentsGroups("Java Turtle", 1);// group name and group id // bu gurubumuz

// bu usttekine alttaki ogrenci ekliyor
        group1.addStudent(student1);// grup bire student 1 ekliyor bunu ds
        //public void addStudent(Student student){// takes one student object, and adds it to the arraylist of student
        //        // each group they have own their student
        //        students.add(student);// hepsi icin ayni seyi yapcak sadece ogrencu eklicek



        Student[] students = {student2, student3, student4, student5};// bu arraye eklemek icin metod yapti



  group1.addStudent(students);//     Student[] students = {student2, student3, student4, student5}; bunu group 1 ekliyor
// bu yukaridaki liste halinde adlari 1 ,2,3,4, olan ogrenciyi Array olarak ekliyor


 group1.addStudent("Khashayar",34,'M',"f25");
 // bu hem yeni ogrenci yaratiyor hem de ekliyor

System.out.println(group1);

group1.removeStudent("D43");
        group1.removeStudent("E27");

        System.out.println(group1);

      for(Student each: group1.students) {
          System.out.println(each);

      }


        StudentsGroups group2= new StudentsGroups("Java Turtle", 1);
        StudentsGroups group3= new StudentsGroups("Java Turtle", 1);
        StudentsGroups group4= new StudentsGroups("Java Turtle", 1);

        StudentsGroups[]groups={ group1, group2, group3, group4};

        // iterate each group
        // add remove metho
        // display all the names of student

      }






    /*
	3. Create a class named TestObjects
	            3.1 Create 5 Student objects
	            3.2 Create a StudentGroup object
	            3.3 Add all the student objets to the StudentsGroup object' students list
*/




}
