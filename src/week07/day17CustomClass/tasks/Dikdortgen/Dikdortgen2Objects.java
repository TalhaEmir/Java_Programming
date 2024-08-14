package week07.day17CustomClass.tasks.Dikdortgen;

public class Dikdortgen2Objects {
    public static void main(String[] args) {


        Dikdortgen dikdortgen1 = new Dikdortgen();

        dikdortgen1.width=10.5;
        dikdortgen1.length=30.5;
        System.out.println(dikdortgen1);

        System.out.println(dikdortgen1.calculateArea());
        System.out.println(dikdortgen1.perimeterArea());

        Dikdortgen dikdortgen2 = new Dikdortgen();
        dikdortgen2.width=10.5;
        dikdortgen2.length=30.5;

        System.out.println(dikdortgen2);
        System.out.println(dikdortgen2.calculateArea());
        System.out.println(dikdortgen2.perimeterArea());


    }
}
