package week11.Day28.StaticTask.Persons;

public class PersonTest {
    public static void main(String[] args) {

        Person person1=new Person("Alex", 11,'M',"Polish");
        Person person2=new Person("Musa", 10,'M',"Arabic");
        Person person3=new Person("Ali", 12,'M',"turkish");
        Person person4=new Person("Berk", 111,'M',"lale");

        System.out.println(person1);//Person{name='Alex', age=11, gender=M, language='Polish' planet= Earth isHuman= truehasNose= truenumberOfWings= 0numberOffHead1}
        person4.name="James";
        person1.planet="Mars"; // it is not right way
        Person.planet="World"; // it is right way

        Person.printPlanetName();
       person1.eat("apple");
       person2.drink("water");


    person1.eat("bakalva");//Alexeating thisbakalva in this World

        person2.drink("ayran");//Musadrinking thisayran in this World



    }
}
