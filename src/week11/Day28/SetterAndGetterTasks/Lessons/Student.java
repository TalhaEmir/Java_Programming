package week11.Day28.SetterAndGetterTasks.Lessons;

public class Student {

    private String name;
    private int age;// on;y way to outside this data is, using Getter


    public String getName() {


        if(name==null){
            System.err.println("Name has not been set");
            System.exit(1);
        }
        return name;
    }


    public void setName(String name) {
        boolean hasDigit= false;


        for(char each:name.toCharArray()) {
            if(Character.isDigit(each)){
                hasDigit= true;
                break;
            }
        }


        if(hasDigit){
            System.err.println("Invalid name;" + name);
            System.exit(1);
        }



        this.name = name;
    }




    /////////////////Getter/////////////////////////


    //getters and setters both of them instance methods
    //Getters is used for /*reading*/ the private data (instance variable only)
    //Setter is used for writing(modifying) the private data (instance variable) only;
    //getters is a instance methods
    // it is getters instance methods / allows us to read this data outside of the class. It is returning private data
    //it does not have parameter// it is gonna return the value of private age


    public int getAge(){ // READ ONLY
        if(age==0){
            System.err.println("Age is not valid for " );
            System.exit(1);
        }
        return age;
    }


    // current class methods only current classes methods directly access private variable






    // why we are using this getAge because it is understandable.






//getter for only reading for data -->




    /////////////////Setter/////////////////////////


    // Passes a parameter and parameter will be assigned to private instance variable
    //And instance method with the return type of void.
    //Data type of parameter must match with the data type
    // only purpose of the setter is update the value original value of the private value


    //user hats to provide argument in setter
    // because we are determining the value of the private
    // after the convert private with get we are setting value
    //setter is instance method we can call with the object
    // setter is the only way we can set the private valiu outside the class
    public void setAge(int age){//WRITE ONLY THE DATA
        if(age<1 || age>100 ){// if the age is invalid
            System.err.println("invaid age: " + age);
            //return;// exiting the method
            System.exit(1);// it is gonna program terminate entire program gonna terminated


            //if exit method terminate the method even get method nots gonna wotk at the test page
        }
        this.age=age;
    }






}


