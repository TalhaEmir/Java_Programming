package Tekrar.Tekrar.Class.Lesson;

public class CarTestObject {
    public static void main(String[] args) {

               Car mercedes= new Car();
               Car bmw= new Car();

               mercedes.model="CLK";
               mercedes.year=1994;
               mercedes.size='L';
               mercedes.color="White";
               mercedes.fuelType="Diesel";

               mercedes.eat();


               System.out.println(mercedes);


    }
}
