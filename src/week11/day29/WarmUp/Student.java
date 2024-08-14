package week11.day29.WarmUp;

public class Student {
    private String name;
    private int age;
    private char gender;
    private char grade;
    private String schoolName;

    public Student(String name, int age, char gender, char grade, String schoolName) {
        setName(name);
        setAge(age);
        setGender(gender);
        setGrade(grade);
        setSchoolName(schoolName);
    }

    public String getName(){
        if(name==null){
            name="Unknown";
        }
        return name;
    }

    public void setName(String name){
        if(name.isEmpty()){
            System.err.println("Invalid Student Name");
            return;
        }
        this.name=name;
    }

    public String getSchoolName() {
        return schoolName;
    }


    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }



    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age<5 || age> 90){
            System.out.println("Age can not be this ");
            return;
        }
        this.age=age;

    }


    public char getGender(){
        return gender;
    }

    public void setGender(char gender){

       gender=Character.toUpperCase(gender);
       if(gender=='M'||gender== 'F'){
           this.gender=gender;
       }else{
           System.out.println("Wrong Gender");
           System.exit(1);

       }
    }

    public char getGrade(){
        return grade;
    }


    public void setGrade(char grade){
        grade=Character.toUpperCase(grade);

            if(grade=='A'|| grade=='B' || grade=='C' || grade=='D' || grade=='F'){
                this.grade=grade;
            }else{
                System.err.println("Wrong Note");

        }
    }




    public void study(){
        System.out.println(name+" is studying" +schoolName);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" +name + '\'' +
                ", age=" + age +
                ", gender=" +gender +
                ", grade=" + grade +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
