package week07.day17CustomClass;

public class Dog {


    public String name; //instance variable
    public String breed;
    public String size;
    public char gender;
    public int age;
    public String colour;
                        // max ,            husky , m             4         small         red
    public void setInfo(String name, String breed, char gender, int age,String size, String colour) {
       this.name= name; //this keyword is used for calling the instance variables
       this.breed=breed;
       this.gender=gender;
       this.age=age;
       this.size=size;
       this.colour=colour;



        // you need to assing instance variable name to local variable
        //also it sohuld be six argument
        // istance variable name//
        // right side name yukaridak istance variables
        //left side name is aegument
        //whenthe setinfo methods call one argument name such as String name has to provided
        // that argumen set of instance variables name of the dog object
        // this keyword is used for calling the instance variable name
    } // this method can help us to set all the information of the dog at once


    public  void eat(){
        System.out.println(name + " is eating");
    }


    public void drink(){
        System.out.println(name + "is drinking water");

    }


    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", size='" + size + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
}
