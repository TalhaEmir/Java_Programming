package CodingBath;

public class HelloName {

    public static void main(String[] args) {

        System.out.println(helloName("Bob"));

        System.out.println(theEnd("Hello",false));



        System.out.println("======================");



        System.out.println(withoutEnd2("Araba"));
        /*Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".

helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"*/


    }

    public static String withoutEnd2(String str) {
        String result="";
        if(str.length()>4){
            result += str.substring(1,str.length()-1);
        }

        if(str.length()>=3){
            result= ""+str.charAt(1);
        }

        if(str.length()<=2){
            result="";
        }

        return result;
    }


    public static String theEnd(String str, boolean front) {
        String result = "";

        if (front == true) {
            result = str.substring(0, 1);

        }

        if(front==false){
            result=str.substring(str.length()-1);
        }
        return result;
    }


    public String firstHalf(String str) {
        String result = "";

        if (str.length() % 2 == 0) {
            result = str.substring(0, str.length() / 2);

        }

        return result;

    }

    public static String helloName(String name) {
        String result = "Hello " + name + "!";
        return result;
    }


}

