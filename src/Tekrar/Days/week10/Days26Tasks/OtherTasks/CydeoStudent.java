package Tekrar.Days.week10.Days26Tasks.OtherTasks;

public class CydeoStudent {
    public int age;
    public String name;
    public String id;
    public char grade;
    public double batchNumber;
    public double groupNumber;
    public static String schoolName;
    public static String programmingLanguage;

    @Override
    public String toString() {
        return "CydeoStudent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", grade=" + grade +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                "school name" + schoolName+
                "programmingLanguage" + programmingLanguage+
                '}';
    }

    public CydeoStudent(){

   }

    static{
        schoolName= "Cydeo";
         programmingLanguage= "JAVA";
    }

    public void study(){

       System.out.println(name+ " is working on " + programmingLanguage);

    }

    public CydeoStudent(int age, String name, String id, char grade, double batchNumber, double groupNumber) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
    }



    public void attendClass(String name, String id, int batchNumber){
        this.name=name;
        this.id=id;
        this.batchNumber=batchNumber;
        System.out.println(name + "with this id " + id + "from this batch " + batchNumber + "is studying" );
    }

    public void printSchoolName(){
        System.out.println(name +" is going this school" +  schoolName  );
    }


}
