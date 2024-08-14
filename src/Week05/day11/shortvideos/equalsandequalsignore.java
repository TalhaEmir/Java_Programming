package Week05.day11.shortvideos;

public class equalsandequalsignore {

    public static void main(String[] args) {

                String str1="Java";
                String str5="JAVA";

                // euqlasof look for same string
        //== same location

                String str2= new String("Java");
                String str3= new String("Java");
                String str4= new String("JAVA");

        System.out.println(str1==str2);
        System.out.println("============1");
        System.out.println(str1.equals(str2));
        System.out.println("============2");
        System.out.println(str2.equals(str3));
        System.out.println("============3");
        System.out.println(str3.equals(str4));
        System.out.println("============4");
        System.out.println(str5.equals(str2));

        // IGNORE THE CASE SENSIVITY WE CAN USE EQUALignorecase

        System.out.println(str3.equalsIgnoreCase(str4));






    }
}
