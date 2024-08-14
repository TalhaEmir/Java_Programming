package week10.Day27.LONG;

public class TestStaticInitializationBlock {

    public static void main(String[] args) {
        //new StaticInitializationBlock(); it is not good idea
        // cunku statik sadece bir kez calisiyor
        // yukaridaki hep caliscak new StaticInitializationBlock() metodu
        System.out.println(StaticInitializationBlock.a);
        System.out.println(StaticInitializationBlock.b);
        System.out.println(StaticInitializationBlock.c);

        System.out.println("==============================");

        System.out.println(AccessModifiers.publicDate);//public is accessible within same package
        System.out.println(AccessModifiers.protectedDate);//protected is accessible within same package
        System.out.println(AccessModifiers.defaultDate);//default is accessible within same package
        new AccessModifiers();

        /*System.out.println(AccessModifiers.privateDate);// private is bot accessible within sam package
*/

        AccessModifiers.publicMethod();
        AccessModifiers.protectedMethod();
        AccessModifiers.defaultMethod();
        //AccessModifiers.privateMethod();






    }
}
