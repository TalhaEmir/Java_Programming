package week09.DAY22;

public class DAY22WRAPPERCLASSSHORTS {

    public static void main(String[] args) {

        byte a=10;
        Byte b=(a);

        System.out.println(b);

        //each pritmivie its own class
        //byte should be byte

       // Integer c=a;// wrong

        Double d=2.5;
        double x=d;//unboxing

        String str="12";

        System.out.println(str+1);//121

        int c= Integer.parseInt(str);
        System.out.println(c);//12
        System.out.println(c+1);//13

        String str2="0.5";

       double e= Double.parseDouble(str2);
        System.out.println(str2);
        System.out.println(e);

/*
 String doubleStr = "123.45";

        // String'i double primitive türüne dönüştürme
        double doubleValue = Double.parseDouble(doubleStr);
        System.out.println("Primitive double value: " + doubleValue);
        // Çıktı: Primitive double value: 123.45
    }*/

    }
}
