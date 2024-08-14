package Tekrar.Tekrar.StringManipulation.Lesson;

public class StringManipulation {

    public static void main(String[] args) {
            String str="Wooden Spoon";
            //String pool= they are at the pool String str="Wooden Spoon";
        //heap buyuk olan new olanlar oray agidiyor

        String str1="Wooden Spoon";// bunlar String Poolda ve her iki cisim degil sadece Java orada
        String st2="Wooden Spoon";

        System.out.println(str1==st2);// it is pointing same object at the pool. If is same object == it is looking object

        String st=new String("Java");// thats at the heap//allocated in the new heap memory
        String st1=new String("Java");
        System.out.println(str1==st);//false because new keyword create new object
        System.out.println(st==st1);//false because different object



    }
}
