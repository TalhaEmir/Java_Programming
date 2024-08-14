package MurodilSessions.murodilsessions4;

public class shelfLife {
    public static void main(String[] args) {

        int outsideTemperature= 92,
       shelfLife= 10;
        String result="";

        if (outsideTemperature > 90){
            shelfLife -= 4;
        }else{


            System.out.println("result = " + result);
        }
    }
}
