package Week05.day11.lessons;

import java.sql.SQLOutput;

public class Stringmethods3 {

    public static void main(String[] args) {

        String word="";

        boolean r1=word.isEmpty();

        System.out.println(r1);
        System.out.println("//======isEmpty========isBlank===================");

        String str= "   ";
        boolean r2=str.isEmpty();
        boolean r3=str.isBlank();

        System.out.println("r2  =" + r2);
        System.out.println("r3  =" + r3);

        System.out.println("//================================================");

        String str1="Cydeo";

        String str2= new String("Cydeo");

        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        String str3= new String("cydeo");

        System.out.println(str2.equals(str3));

        System.out.println("//=========equals=============================");

        String s1="JAVA";
        String s2="java";

        System.out.println(s1.equals(s2));// false

        System.out.println(s1.equalsIgnoreCase(s2));// true letter sensivity close

        System.out.println("//================contains method============================");

        String students= "Hasan Naran Sumeye Nataliia";

        boolean hasAhmed= students.contains("Ahmed");

        System.out.println(hasAhmed);
        System.out.println("//================contains method============================");
        String sentence="My favorite programming language is Java";

        boolean hasJava= sentence.toLowerCase().contains("java");// ignore the case sensivity you put lower case after sentence
        // it is going to do sentence lowercase

        System.out.println("hasJAVA= " + hasJava);
        System.out.println("//================startswith============================");

        sentence="Cybertek school is the best";

       boolean startswith= sentence.startsWith("Cybertek");
        System.out.println(startswith);
        System.out.println("//================startswith============================");

        String name="Michael";
        boolean l=name.startsWith("Da");

        System.out.println(l);
        System.out.println("//================ending with============================");

        String url="www.cydeo.com";
        boolean isValid=url.startsWith("www.");

        System.out.println(isValid);

        String email="cydeoSchool@gmail.com";

        boolean isGmail=email.endsWith("gmail.com");

        boolean isYahoo= email.endsWith("yahoo.com");

        boolean isHotmail= email.endsWith("hotmail.com");

        System.out.println("isHotmail = " + isHotmail);
        System.out.println("isYahoo = " + isYahoo);
        System.out.println("isGmail = " + isGmail);


























    }
}
