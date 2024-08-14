package week11.Day28.SetterAndGetterTasks.Person1;

import java.time.LocalDate;

public class Person1 {



    private String name;
    private int age;
    private char gender;
    private LocalDate dateOfBirth;

    public Person1(String name, int age, char gender, LocalDate dateOfBirth) {
        setName(name);
        setAge(age);
        setGender(gender);
        setDateOfBirth(dateOfBirth);
    }


    public String getName(){
        if(name==null || name.isEmpty()){
            return "Unknown";
        }

        return name;
    }

    public void setName(String name){
        if(name.isEmpty()|| name.isBlank()|| name=="null"){
            System.err.println("Name is not valid");
           return;
        }
        this.name=name;

    }

   public int getAge(){

        return age;
   }

   public void setAge(int age){
        if(age<0 || age>120){
            System.err.println("Age is not valid +");
            return;

        }
        this.age=age;
   }

   public char getGender(){

        return gender;
   }

   public void setGender(char gender){
        gender=Character.toUpperCase(gender);

        if(gender=='M' || gender=='F'){
            this.gender=gender;
        }else {
            System.err.println("Gender is not valid +");
            this.gender='N';
        }

   }


   public LocalDate getDateOfBirth(){
        return dateOfBirth;
   }



    public void setDateOfBirth(LocalDate dateOfBirth) {
        if (dateOfBirth.isAfter(LocalDate.now())) {
            System.err.println("Date of birth can not be after today!");
            System.exit(1);
        }
        this.dateOfBirth = dateOfBirth;
    }


    @Override
    public String toString() {
        return "Person1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", dateOfBirth=" + dateOfBirth+
                '}';
    }

    /*variables*
    name age gender dateofbirth/

    write name connot be null,empty ,blank

   read return unknoiwn read;


    age;
    write=age can not be less than zero or greater than 120

    gender can only be M OR F

    //*** date of birrth

    write = can not be after todays date


    add a constuructor that an sett all the fields

    add to string method
     */


}
