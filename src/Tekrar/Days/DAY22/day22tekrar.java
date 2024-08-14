package Tekrar.Days.DAY22;
import java.util.ArrayList;
import java.util.Arrays;
public class day22tekrar {

    public static void main(String[] args) {

       // add, ekleme kismi

        ArrayList<String>list=new ArrayList<>(); //sag taraftaki paranetz icine bisey yazmaya gerek yok her ihtimale karsi

        list.add("A");
        list.add("b");
        // or

        list.add(1,"c"); // seklinde de oliyor

        System.out.println(list);


        // size- digerlerindeki gibi lengthg cakmiyoruz

        list.size();
        ArrayList<Integer>list1= new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);


        System.out.println(list.size());//3

        //yaa
        int total=list1.size();
        System.out.println(total);//3


        //GETMETHOD
        // sondaki adi alma

        ArrayList<String>student1List=new ArrayList<>();//new ArrayList<>(); it didnt change any other objects its has own memory
        student1List.add("Mogammad");
        student1List.add("Abdurrasul");
        student1List.add("Abidullah");
        student1List.add("Tatiana");

        System.out.println(student1List.size());
        String lastPerson=student1List.get(student1List.size()-1);

        list1.get(1);
        System.out.println(list1.get(1));//3
        int fifthElement=list1.get(2);//2
        System.out.println(fifthElement);//3
        list1.add(1,15);
        list1.add(2,25);

        //wrapperclassi Arraylistin icinde kullaniyoruz
        //<Integer> normalde integer olmamali veya int ama biz wrapper koyduk Integer
        // it can duplicated elements

        System.out.println(list1);//[]--> list=icindeki elemanlari soyluyor//[1, 15, 25, 2, 3]
        System.out.println(list1.size());// size-->lengh soyluyor


        ArrayList<String>studentList=new ArrayList<>();
        studentList.add("Mogammad");
        studentList.add("Abdurrasul");
        studentList.add("Abidullah");
        studentList.add("Tatiana");
        System.out.println(studentList);
        System.out.println(studentList.size());
        System.out.println(studentList.get(1));
        System.out.println(studentList.get(studentList.size()-1)); //bu metod studentListtin son indeksindeki karakyer icin

        //autoboxing
        byte a=10;
        System.out.println(a);
        Byte b=a;

        //each pritmivie its own class
        //byte should be byte


        //unboxing

        Double c=10.5;
        System.out.println(c);
        double d=c;
        // parse methods
        //Integer num1=Integer.parseInt(str);//unboxing
        //parse metodları temel veri tiplerine (int, double, boolean, vb.)
        // dönüşüm yapmak için kullanılır.
        // Bu metodlar genellikle temel veri tipinin wrapper sınıfında
        // (Integer, Double, Boolean, vb.)
        // statik (static) metodlar olarak bulunur.
        //parse metodlarında genellikle dönüşüm yapılan tip küçük harfle yazılan temel veri tipi (primitive type) iken,
        // valueOf metodlarında dönüşüm yapılan tip büyük harfle yazılan wrapper sınıf (object type) oluyor.

        String str="12";

        System.out.println(str+1);//121 needen cunku string + sayi string gibi olur

        //sayet bir stringi sayiya editliceksek parse metodu

        int sayi=Integer.parseInt(str);

        String kelime="13";

        Double bd=Double.parseDouble(kelime);
        System.out.println(bd);//13.0

        //valuemethod
        //valueOfMethod:return wrapper class objects




        Integer num2=Integer.valueOf(str);// not any boxing

        System.out.println("==================");


        String s1="20.5";

        Double num3=Double.parseDouble(s1);
        System.out.println(num3);



        //char autoboxing

        char ad='a';
        System.out.println(ad);
        Character cd=ad;

        char ch='@';

        // bu Character charin buyugu gibi metodlarda ona isLetter, isLowercase, isDigit,

        Boolean isDigit= Character.isDigit(ch); // character tek almamizi sagliyor

        Boolean isCharacter= Character.isLetter(ch);// character harf mi degil mi

        boolean isLowerCaseLetter= Character.isLowerCase(ch);//metod
        boolean isUpperCaseLetter= Character.isUpperCase(ch);
        System.out.println("is digit" + isDigit);//is digitfalse

        boolean isSpecialChar=!Character.isLetterOrDigit(ch);//metod special character icin



        //iterating ArrayList

        ArrayList<Integer>numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println(numbers);

        for(Integer numeros:numbers){
            System.out.println(numeros);
        }



        //soru

        /*2. Write a program that can find the minimum and maximum numbers from a two dimensional array of integers
        Ex:
        array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

        output:
        Minimum number is: -200
        Maximum number is: 1000*/

        int[][]array = { {100, 20, 300}, {10, 1000, 50}, {-200, 400, 0} };

        int max=array[0][0];
        int min=array[0][0];

        for(int i=0; i<=array.length-1; i++){
            int each[]=array[i];
            for(int j=0; j<each.length-1; j++){
                int element=each[j];

                if(element>max){
                    max=element;
                }
                if(element<min){
                    min=element;
                }

            }
        }


        String string="a1b2c3d4e5";

        int sum=0;

        //Character.isDigit(each) ifadesi,
        // each karakterinin bir rakam (digit) olup olmadığını kontrol etmek için kullanılır.
        // Burada Character bir sınıftır ve isDigit bu sınıfın bir metodudur.
        // Bu metodu kullanarak, karakterin rakam olup olmadığını öğreniriz.

        for(char each: string.toCharArray()){
            if (Character.isDigit(each)){

                //char tipindeki each değişkenini Integer.parseInt("" + each) ile int tipine çeviriyor.
                // Burada "" + each ifadesi, each karakterini önce String tipine dönüştürüyor.
                // Sonrasında Integer.parseInt metodu bu string'i bir tamsayıya çeviriyor.
                //Evet, parse metodu ile char tipindeki bir karakteri int tipine dönüştürebilirsin.
                // Ancak, doğrudan bir char'ı int'e çevirmek için önce onu bir String'e dönüştürmen gerekir,
                // çünkü parse metodları String tipinde giriş bekler.
                // Bunun için şu şekilde bir yöntem kullanabilirsin:

                sum+=Integer.parseInt(""+ each);
            }
        }
        System.out.println(sum);




















    }


}
