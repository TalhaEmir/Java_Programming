package Week05.day11.lessons;

public class StringMethods1 {

    public static void main(String[] args) {

        String str1 = "CYDEO SCHOOL";// you can not any change impossible to change if yo ucreated variable and data
        //you can not modified

        str1.toLowerCase(); //cydeo school

       /*if you want to assign cydeo school for
       lowercase option you have to add it str1 before the   str1.toLowerCase()
        */
        str1=str1.toLowerCase();

        System.out.println(str1);

        System.out.println("//================================================");

        String str2 =( "java programming");
        str2.toUpperCase();//JAVA PROGRAMMING
        str2=str2.toUpperCase();
        System.out.println(str2);

        System.out.println("//================================================");
        String word="Wooden Spoon";
        word=word.toUpperCase();//WOODEN SPOON
        word=word.toLowerCase();//wooden spoon
        System.out.println(word);

        System.out.println("//================================================");


        String str4="                             Cydeo School";

      str4=str4.trim();//"Cydeo School"

        System.out.println(str4);

        System.out.println("//================================================");

        String sentence1="Today is Sunday, and we have Java Class";

       int index1= sentence1.indexOf('w');
       System.out.println(index1);

        System.out.println("//================================================");

        String s1= "I love Java Programming";
        int firstA=s1.indexOf('a');
        System.out.println(firstA);
        System.out.println("//================================================");
        int secondA=s1.indexOf("a P");

        System.out.println(secondA);

        System.out.println("//================================================");
        System.out.println("//================================================");

        String s2= "Java Phyton JavaScript Cydeo Phyton";

        int a1=s2.indexOf('a');
        System.out.println(a1);
        System.out.println("//================================================");
        int a2=s2.indexOf("a P");
        System.out.println(a2);
        System.out.println("//================================================");
        int a3=s2.indexOf("avaScript");
        System.out.println(a3);
        int a4=s2.indexOf("aS");

        System.out.println("//================================================");

        String w="Java";
        System.out.println(w.indexOf('a'));// 1 if it integer you can do it in the println section

        //lastindexofmethod

        System.out.println(w.lastIndexOf('a'));// 3

        String w2="Java Phyton JavaScripT Cydeo Python";
        System.out.println(w2.lastIndexOf('a'));
        System.out.println(w2.lastIndexOf('P'));













        //








    }
}
