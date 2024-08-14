package week07.day17CustomClass;

public class TestDogObject {

    public static void main(String[] args) {


        //new Dog(); // object created but it is not usable we have to store it into variable

        Dog dog1= new Dog(); // right now we can store inside dog1 this variable
        // dog1 is object name

        // object has been created


        dog1.name="Max";
        dog1.breed="Husky";
        dog1.gender='M';
        dog1.age=4;
        dog1.size="Large";
        dog1.colour="Gray";

        System.out.println(dog1.name);

        System.out.println(dog1.breed);




        dog1.eat();


        System.out.println(dog1.gender);
        Dog dog2= new Dog();
        dog2.name="Bella";
        dog2.breed="Golden Retrievaer";
        dog2.age=2;
        dog2.gender='m';
        dog2.size="Small";
        dog2.colour="Orange";

        System.out.println(dog2.age);
        Dog dog3=new Dog();
        dog3.setInfo("Loki", "Husky",'m',3,"Medium", "black");

        Dog dog4=new Dog();
        dog4.setInfo("Chuck","Bulldog",'m',4,"small", "white");



        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);
        System.out.println(dog4);

        dog3.eat();













    }


}
