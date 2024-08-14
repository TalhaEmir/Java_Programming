package week09.DAY22;

public class WrapperClassMethods {
    public static void main(String[] args) {


        //parse methods:Convert to string to primitive values
        //return primitive types,
        //parse metod sadece string kabul eder.


        String str="20";
        System.out.println(str+1);//201

        //Integer num1=Integer.parseInt(str);//unboxing
        //parse metodları temel veri tiplerine (int, double, boolean, vb.)
        // dönüşüm yapmak için kullanılır.
        // Bu metodlar genellikle temel veri tipinin wrapper sınıfında
        // (Integer, Double, Boolean, vb.)
        // statik (static) metodlar olarak bulunur.
        //parse metodlarında genellikle dönüşüm yapılan tip küçük harfle yazılan temel veri tipi (primitive type) iken, valueOf metodlarında dönüşüm yapılan tip büyük harfle yazılan wrapper sınıf (object type) oluyor.

        int num=Integer.parseInt(str);//not anyboxing
        System.out.println(num+1);//21


        //thevaluemethod

        Integer num2=Integer.valueOf(str);// not any boxing


        System.out.println("==================");


        String s="20.5";


        double num3=Double.parseDouble(s);//
        Double num4=Double.valueOf(s);

        String x="Maybe";

        boolean r1=Boolean.parseBoolean(x);//false

        Boolean r2=Boolean.valueOf(x);// false

        System.out.println(r1);
        System.out.println(r2);

        //valueOfMethod:return wrapper class objects

        System.out.println("=============");

        char ch='@';


        // bu Character charin buyugu gibi metodlarda ona isLetter, isLowercase, isDigit,Is
        boolean isDigit=Character.isDigit(ch);
        boolean isLetter= Character.isLetter(ch);// isLetter is a method
        boolean isLowerCaseLetter= Character.isLowerCase(ch);//metod
        boolean isUpperCaseLetter= Character.isUpperCase(ch);
        System.out.println("is digit" + isDigit);//is digitfalse

        boolean isSpecialChar=!Character.isLetterOrDigit(ch);//metod special character icin



        System.out.println("is letter" + isLetter);//is lettertrue


        System.out.println("islowerCaseLetter="+ isLowerCaseLetter);


       //bundaki her bir karakteri char olarak almak icin cunku topliucaz
        //bu haliyle alamayiz bunu char haline getirtik ve arrayin icine soktuk
        //char each bildigimiz string str gibi

        //fakat dikat edilmesi gerekeen 1 aldiginda bunu digit olarak aliyor bunu numaraya cevirmemiz lazim
        // ascii tabledaki digit degerini alacak direk 1 degil
        //parse metod sadece String kabul eder ama
        // Integer.parseInt(" " + each) asamasinda chari string cevirdik. onu da numaraya cevirdik

        String string="a1b2c3d4e5";
        int sum=0;
        for (char each : string.toCharArray()) {
            if(Character.isDigit(each)){
                sum +=Integer.parseInt(""+each);

            }
        }

        System.out.println(sum);























    }
}
