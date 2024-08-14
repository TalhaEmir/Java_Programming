package MurodilSessions.week06;

public class adidas {


    //https:// www.adidas.com/us/help/size_charts
    // write a method getMenShirtSize-> /> acepts in chestSize in cm
    // returns char as size
    // getMenShirtSize(90)-> L

    public static void main(String[] args) {


       //1 assing the retrun value to variable char mySize=getMenShirtSize(88);

        getMenShirtSize(88);
        System.out.println(getMenShirtSize(90));
        char mySize= getMenShirtSize(90);
        System.out.println(getMenShirtSize(99));
        System.out.println("=========================");


        //https:// www.adidas.com/us/help/size_charts
        // write a method getMenShirtSize-> /> acepts in chestSize in cm
        // returns char as size
        // getMenShirtSize(90)-> 'S'
        //getMenShirtSize(105)->'L'

    }

    public static char getMenShirtSize(int chestSize) {

        char shirtSize;
        if (chestSize >= 87 && chestSize<=92) {
            shirtSize = 'S';

        }else if (chestSize >= 93 && chestSize<=100) {
            shirtSize = 'M';
        }else if (chestSize >= 101 && chestSize<=108) {
            shirtSize = 'L';
        }else {

            System.out.println("Not available for " + chestSize);
            shirtSize = 'N';

        }

        return shirtSize;

        // publis static getsMenshirtsize(int hipsize int cjestsize


    }
}