package Tekrar.Tekrar.StringManipulation.Tasks;

public class beginningIndex {
    public static void main(String[] args) {
System.out.println("========Index and Last Index================");

        String str="Java Programming";

        int index=str.indexOf("a");//

        System.out.println(index);//1

        int lastIndex=str.lastIndexOf("v");

        System.out.println(lastIndex);//2




System.out.println("========Replace================");

String sentence="Phyton is cool, I love Phyton Programmin";

sentence=sentence.replace("Phyton", "Java");

System.out.println(sentence);//Java is cool, I love Java Programmin


System.out.println("========Concat================");


String str2="WOOODENSPOON";

str2= str2.concat(str);

System.out.println( str2);//WOOODENSPOONJava Programming

System.out.println("========LowerCase================");

str=str.toLowerCase();

 System.out.println(str);//java programming


System.out.println("========equalsIgnoreCase===============");


String str3= "Java Programming";
String str4="JAVA PROGRAMMING";

        System.out.println(str3.equalsIgnoreCase(str4));//true

        //unique.indexOf(each)==-1

       /* //creating subvalue you can do beginning and ending index or just beginning index
// String url="www.amazon.com";// ends with
        // //replaceFirst method just change the first one it matched and return it is gonna new string
        //  String sentence="Phyton is cool, I love Phyton Programmin";







       */ //System.out.println(str3.equalsIgnoreCase(str4));


    }
}
