package week06.Day14.tasks.HocaninTaskCozumu;

public class literaltask2 {


        public static void main(String[] args) {
            // Sadece cube(5) metodunun sonucunu ekrana yazdırma
            System.out.println(cube(5));
        }

        public static int square(int a) {
            int squareMethod = a * a;
            System.out.println(squareMethod); // square metodunun sonucunu yazdır
            return squareMethod;
        }

        public static double square1(double b) {
            double squareMethod1 = b * b;
            System.out.println(squareMethod1);
            return squareMethod1;
        }

        public static int cube(int a) {
            int cubeMethod = a * square(a);
            return cubeMethod;
        }

    }



