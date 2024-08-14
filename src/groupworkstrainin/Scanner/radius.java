package groupworkstrainin.Scanner;

import java.util.Scanner;

public class radius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius of a circle: ");
        double radius = input.nextDouble();
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is " + area);
        System.out.println("Please re enter radius of a circle: ");
        radius = input.nextDouble();
        double perimeter = 2 * radius * radius;
        System.out.println("The perimeter of the circle is " + perimeter);




    }
}
