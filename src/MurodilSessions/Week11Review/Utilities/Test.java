package MurodilSessions.Week11Review.Utilities;

import week10.Day27.Data;
import week10.Day27.LONG.AccessModifiers;

//import week10.Day27.Data;
public class Test {
    public static void main(String[] args) {

    System.out.println(Data.d);// sinif adi vererek cagirdik cunku static
    System.out.println(Data.e);// sinif adi vererek cagirdik cunku static
    System.out.println(Data.f);// sinif adi vererek cagirdik cunku static

    Data.method3();// sinif adi vererek cagirdik cunku static
    Data.method4();// sinif adi vererek cagirdik cunku static


        Data obj= new Data();
        obj.method1();
        obj.method2();

// bu iki sinif intance me static --> class import ettiginde tamamen ulasilir
        //herseyi import eder

        System.out.println("======================");
        System.out.println(AccessModifiers.publicDate);//In same class same package or different still it is reacheble
        // public is always accessible in different packages.
        /*System.out.println(AccessModifiers.protectedDate);// only accessible at subclass-- protected not always accessible
*/
        /*System.out.println(AccessModifiers.defaultDate);//different package it is not accessible
*/
        /*System.out.println(AccessModifiers.privateDate)// different package is not aceesible
        */
        new AccessModifiers();

    }
}
