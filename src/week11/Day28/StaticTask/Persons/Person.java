package week11.Day28.StaticTask.Persons;

public class Person {

    // static it does not belong to the object is belonging to the class
    // instance belong to the object// without the class object never exist

    //constructor in order to create object we have to have constructor;
    //every single class must have constructor
    // as long as object cretaed constructer get executed.
    /// instance variables object members but also accept class members
    // static class members bur static members doesnt access instance members variables or method
    public String name; // if we delete public we can access fom just this packet not outside the packet
    public int age;
    public char gender;
    public String language;
    public static String planet;
    public static boolean isHuman;
    public static boolean hasNose;
    public static int numberOfWings;
    public static int numberOffHead;




    static{
            planet="Earth";
        isHuman=true;
        hasNose=true;
        numberOfWings=0;
        numberOffHead=1;
    }

    public Person(String name){
        this.name=name;
    }

    public Person(String name,int age ){
        this(name);
        this.age=age;
    }

    public Person(String name,String language ){
        this(name);
        this.language=language;
    }

    public Person(String name,char gender ){
        this(name);
        this.gender=gender;
    }

    public Person(String name,int age,char gender ){
        this(name,age);
        this.gender=gender;
    }

    public Person(String name,int age,char gender, String language ){
        this(name,age,gender);
        this.language=language;
    }



public static void printPlanetName(){
        System.out.println("You are living in this "+ planet);
}

public void eat(String food){// it can be public void eat // but data usage no need
        System.out.println(name + "eating this" + food + " in this " + planet);
}
    public void drink(String beverage){
       System.out.println(name + "drinking this" + beverage + " in this " + planet);
    }


    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                " planet= " + planet +
                " isHuman= " +  isHuman+
                "hasNose= " + hasNose +
                "numberOfWings= " +numberOfWings+
                "numberOffHead" + numberOffHead +
                '}';
    }
}
