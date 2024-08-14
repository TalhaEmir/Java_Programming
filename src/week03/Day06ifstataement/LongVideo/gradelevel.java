package week03.Day06ifstataement.LongVideo;

public class gradelevel {

    public static void main(String[] args) {
        int gradeLevel=2;

        if ( gradeLevel>=1 && gradeLevel<=5){
            System.out.println("Elemantary school");
        }
        if(gradeLevel>= 6 && gradeLevel <=8){
            System.out.println("Middle School");
        }

        if(gradeLevel>=9 && gradeLevel <=12){
            System.out.println("High School");
        }
        if(gradeLevel>=13 && gradeLevel <=16){
            System.out.println("College");
        }
        if(gradeLevel>=17 && gradeLevel <=18){
            System.out.println("Grad School");
        }
    }
}
