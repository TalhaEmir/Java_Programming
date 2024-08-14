package Tekrar.MURODILTEKRAR.TekrarMurodilweek6;

public class adidas {


    public static void main(String[] args) {

        System.out.println( getMenShirtSize(90));
        //https:// www.adidas.com/us/help/size_charts
        // write a method getMenShirtSize-> /> acepts in chestSize in cm
        // returns char as size
        // getMenShirtSize(90)-> 'S'
        //getMenShirtSize(105)->'L'

    }


    public static char getMenShirtSize(int size) {
        char menShirtSize = 0;
        if (size > 105) {
            menShirtSize = 'L';
        } else if (size >= 90 && size < 105) {
            menShirtSize = 'M';
        }else if (size > 80 && size < 90) {
            menShirtSize = 'S';
        }else if (size > 70 && size < 80) {
            menShirtSize = 'X';
        }else{
            menShirtSize = 'N';
            System.out.println("Not valid for size " + menShirtSize);
        }
        return menShirtSize;

    }
}