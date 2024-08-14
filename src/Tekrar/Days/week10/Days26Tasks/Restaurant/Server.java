package Tekrar.Days.week10.Days26Tasks.Restaurant;

public class Server {
    public String name;
    public int employeeId;
    public double hourlyRate;
    public boolean fullTime;


    public String toString() {
        return "Server{" +
                "name='" + name + '\'' +
                ", employeeId=" + employeeId +
                ", hourlyRate=" + hourlyRate +
                ", fullTime=" + (fullTime?"full time":"part time") +
                '}';
    }


    public Server(String name){
        this.name = name;


    }



    public Server(String name, int employeeId, double hourlyRate, boolean fullTime) {
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.name = name;
    }

    public void takeOrder(){

        System.out.println(name+"is taking order" );

    }

    public void cleanTable(){

        System.out.println(name+"is cleaning table" );

    }


}
