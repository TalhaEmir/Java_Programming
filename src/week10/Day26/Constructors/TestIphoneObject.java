package week10.Day26.Constructors;

public class TestIphoneObject {

    public static void main(String[]args){


        Iphone iPhone= new Iphone("iPhone12","Black",10000);
        System.out.println(iPhone.model);
        System.out.println(iPhone.color);
        System.out.println(iPhone.price);
// it is wrong side

/*
        System.out.println(iPhone.brand);// it is wrong dont do it like that
        System.out.println(iPhone.OS);// it is wrong dont do it like that
        iPhone.printOperatingSystem();// it is wrong dont do it like that
        //System.out.println(iPhone.);// it is wrong dont do it like that

*/

        //right one we have tu use like this via  class name

        System.out.println(Iphone.brand);
        System.out.println(Iphone.OS);
        Iphone.printOperatingSystem();



    }
}
