package MurodilSessions.Week13.access.b;

public class RunnerB {


    public static void main(String[] args) {
        Mac mac= new Mac();

        mac.os="Sonoma";
        //mac.memory=32; not accessible because this is class does not extend
        System.out.println(mac.toString());
    }


}
