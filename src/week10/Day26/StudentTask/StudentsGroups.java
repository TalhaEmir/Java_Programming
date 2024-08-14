package week10.Day26.StudentTask;

import week06.Day14.tasks.method;

import java.util.ArrayList;
import java.util.Arrays;

// in here purpose is we want to add multiple student object in this StudentsGroups list
// we wat to create multiple StudentObject at StudentGroups

public class StudentsGroups {// StudentsGroup Has A Student// bu cok onemlu

    // if we create ten objects from this class (StudentGroups)
    // public ArrayList<Student>students=new ArrayList<>(); there will be ten copies instance variable(students) as well, ten seperate copies,
    // new ArrayList<>(); will be created ten times for ten objects

public String groupName;
public int groupId;
public ArrayList<Student>students=new ArrayList<>();//students= new ArrayList<>// size:0 bu her gruba ogrenci eklemeye yariyor gibi


//every single students group object they should also have  ArrayList Object
    public StudentsGroups(String groupName, int groupId) {// creates the StudentsGroup Object
         // by setting the groupname and group id
        this.groupName = groupName;
        this.groupId = groupId;
        //students= new ArrayList<>();//
        //sonuc asagidaki gbi
        // StudentGroups group1 = new StudentGroups("Group 1", 1);
        //StudentGroups group2 = new StudentGroups("Group 2", 2);
    }







    public void addStudent(Student student){// bir tane ogrenci ekliyor arrayliste
        // takes one student object, and adds it to the arraylist of student
        // each group they have own their student
        students.add(student);// hepsi icin ayni seyi yapcak sadece ogrencu eklicek

        //sonuc asagidaki gibi
        //group1.addStudent("Alice", 20, 'F', "A01");
       // group1.addStudent("Bob", 21, 'M', "A02");
    }

//yani birisi olan bir ogrenciyi ArrayListe ekleme ikincisi bastan bir ogrenci yaratma icin

    public void addStudent(Student[] students){
        this.students.addAll(Arrays.asList(students));
    }// takes one array of students and adds the array of students to the arraylist of students
    //Evet, doğru anladınız. addStudent(Student[] students) metodu, bir Student dizisini alır ve
    // bu dizideki tüm Student nesnelerini students adlı ArrayList'e ekler.
    // Bu sayede, birden fazla öğrenciyi aynı anda eklemenize olanak tanır.





public void addStudent(String name, int age, char gender, String id){
        //takes name age gender, id of the student info, creates student object by using the given info;
        // bir objecti tam yaratmak icin
       // Student student= new Student(name,age,gender,id);
        students.add(new Student(name,age,gender,id));
//Evet, doğru anladınız. students.add(new Student(name, age, gender, id)); ifadesi,
// students listesine Student türünde yeni bir nesne ekler.
// Bu nesne, new Student(name, age, gender, id) ifadesi ile oluşturulan bir Student nesnesidir.
// students listesi, ArrayList<Student> türündedir ve bu liste yalnızca Student türünde nesneler içerebilir.

        //sonuc  asagidaki gibi
//  group2.addStudent("Charlie", 22, 'M', "B01");
// group2.addStudent("David", 23, 'M', "B02");
}


public void removeStudent(String id){
   // In the method removeStudent, the parameter p represents an element of the students collection.
    // The lambda expression p -> p.id.equals(id) is used to iterate over each element in the students collection and check if the id of the element matches the provided id. If it matches, the element is removed from the collection.

   // To understand how p represents an element of the students collection and
    // what the students collection contains, you need to look at the definition of the students collection and
    // the class type of its elements.
    // Typically, this information is found in the class where this method is defined.



       students.removeIf(p->p.id.equals(id));
}

    @Override
    public String toString() {
        return "StudentGroups{" +
                "groupName='" + groupName + '\'' +
                ", groupId=" + groupId +
                ", students=" + students.size() +
                '}';
    }
}

    /* ArrayList<Student> students = new ArrayList<>();
        students.addAll(Arrays.asList(new Student(), new Student(), new Student(), new Student(), new Student()
        ));*/
/*2. Create a custom class named StudentsGroup
	            Attributes:
	                groupName, groupId, students (ArrayList<Students>)

	            Add a constructor that can set the groupId and groupName
	                    initialize students arraylist in the constrcutor's body

	            Methods:
	                addStudent(Student): adds the specified student to the students arrayList

	                removeStudent(id): removes the student with the specified id from the students arraylist

	                toString(): displays the groupName, groupId and total number of students when a group object is passed in the print statement

	3. Create a class named TestObjects*/