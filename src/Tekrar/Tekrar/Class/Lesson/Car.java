package Tekrar.Tekrar.Class.Lesson;

public class Car {


    //new keyword is used to create an instance of a class


    public String model;
    public int year;
    public char size;
    public String color;
    public String fuelType;


    public void eat(){// instance method it is not gonna be in here static
System.out.println(model + "is using" + " this fuel type as a " + fuelType);
        }

        public void specification(){
            System.out.println(model + "is using" + " this fuel" + fuelType + "its made in " + year + "and size is" + size);
        }


    public String toString() {
        return "model='" + model + '\'' +
                " year=" + year +
                " size=" + size +
                " color='" + color + '\'' +
                " fuelType='" + fuelType + '\''+ "specification"
               ;
    }
}




