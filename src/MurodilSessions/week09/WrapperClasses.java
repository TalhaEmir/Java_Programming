package MurodilSessions.week09;

public class WrapperClasses {
    public static void main(String[] args) {

        System.out.println("Ma int=" + Integer.MAX_VALUE);
        System.out.println("Ma long=" + Integer.MIN_VALUE);

        //Converting from String to Integer
        String price="18.99";
        double priceOfItem = Double.parseDouble(price);
        if (priceOfItem > 0) {
            System.out.println("Price verificaation Passed");
        }else {
            System.out.println("Price verificaation okey");
        }


        // String'i integer'a dönüştürme
        String reviews = "23,914";

        // Virgülleri kaldır
        reviews = reviews.replace(",", "");

        // Yorum sayısının 23 binden fazla olduğunu doğrulama
        int reviewsCount = Integer.parseInt(reviews);
        System.out.println("Reviews count: " + reviewsCount);

        if (reviewsCount > 23000) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        // Autobozing, from primitive to wrapper object
        int a=10;
        Integer b=a;

        //Unboxing, from wrapper class object to primitive

        Integer c=b;
        int d=c;

        int i=Integer.max(10,50);
        System.out.println("i="+ i);

        char ch='A';
        System.out.println("isLetter=" + Character.isLetter(ch));//isLetter=true
        System.out.println("is uppercase=" + Character.isUpperCase(ch));// is uppercase=true
        System.out.println("is lowercase=" + Character.isLowerCase(ch));//is lowercase=false
        char n='a';
        System.out.println("isDigit= " );
    }
}
