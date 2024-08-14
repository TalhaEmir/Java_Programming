package week10.Day27.LONG;

public class InstanceInitializationBlock {

    public String name;
    public int age;

/*
    {//for default value gonna James and 20
        name="James";
        age=20;
    }*/

    public InstanceInitializationBlock( String name,int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        /*
        InstanceInitializationBlock obj1= new InstanceInitializationBlock();
        InstanceInitializationBlock obj2= new InstanceInitializationBlock();

        System.out.println(obj1.name);//James

        System.out.println(obj2.name); // James
*/
        InstanceInitializationBlock obj1= new InstanceInitializationBlock("James",25);
        InstanceInitializationBlock obj2= new InstanceInitializationBlock("James",25);


    }


}
