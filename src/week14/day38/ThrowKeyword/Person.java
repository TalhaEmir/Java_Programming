package week14.day38.ThrowKeyword;

public class Person {


    private String name;
    private int age;
    private final char gender;

    public Person(String name, int age, char gender) {
        setName(name);
        setAge(age);
        if(!(gender =='M' || gender=='F')){// if the gender is invalid
            throw new RuntimeException("Invalid gender" + gender );// throws the runtime exception and crush the progrram ;

        }
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        if(age==0){
            throw new RuntimeException("Age has not been set : " + age );//throws the runtime exception and crush the progrram ;

        }
        return age;
    }

    public void setAge(int age) {

        if(age< 0 || age>150){
            throw new RuntimeException("Invalid Age: " + age );
        }
        this.age = age;
    }

    public char getGender() {
        return gender;
    }


    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }



}
