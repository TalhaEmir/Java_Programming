package week10.Day27.LONG;

public class AccessModifiers {

    public static int publicDate=200;
    protected static int protectedDate=200;

   static int defaultDate=400; //-- it means we dont need that default key word.

    private static int privateData=500;


  public AccessModifiers(){

    }
    public static void publicMethod(){
        System.out.println("Public");
    }

    protected static void protectedMethod(){
        System.out.println("protected");

    }

    public static void defaultMethod(){
      System.out.println("default");
    }


    private static void privateMethod(){
        System.out.println("private");
    }


    public static void main(String[] args) {
        System.out.println(publicDate);// public is accessible with same class
        System.out.println(protectedDate);//protected is accessible with same class
        System.out.println(AccessModifiers.defaultDate);//default is accessible with same class
        System.out.println(AccessModifiers.privateData);//private is accessible with same class

        new AccessModifiers();

        //public is always accessible same package same class or different packages
        //protected is always accessible same package same class but outside package it sometimes accessible not always
        //default is always accessible same package same class but outside package never accesible
        //private outside package never accesible

    }

}
