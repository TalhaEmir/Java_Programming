package Haydenclass.WEEK11;

public class Static {
    int num1;// if we didnt assign access modifier its default
   static String name="Osman";
  static  String name1="TAIEB";

        // if we didnt assign access modifier its default

    // if you put naything next them like private or statyic or other thing it is not ganna default



    public static void main(String[] args) {

        int num2;
       // static String name2; static cannot be local variable

        Static topic2= new Static();
        Static topic3= new Static();

System.out.println("====================");

        Static topic1= new Static();

        System.out.println(topic1.name1);//0
        System.out.println(topic1.name1);//null
        topic1.name="Efe";
        System.out.println(topic1.name);//TAIEB
        System.out.println(topic2.name1);//TAIEB
 System.out.println("====================");


 topic3.name="Nelya";
        System.out.println(topic1.name);
        System.out.println(topic2.name);



        System.out.println("Staticname = " + Static.name);//Staticname = Nelya
        System.out.println("Staticname = " + topic1.num1);//Staticname = 0


        Static.name="Emmi";
        System.out.println("Staticname = " + Static.name);//Staticname =Emmi
        System.out.println("Staticname = " +topic1.name);//Staticname =Emmi
        System.out.println("Staticname = " +topic2.name);////Staticname =Emmi
        System.out.println("Staticname = " +topic3.name);////Staticname =Emmi



        String name_2=name;





    }
}
