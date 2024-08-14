package Tekrar.IbrahimAbi.Restaurant;

public class Server {
    public String name;
    public int employeeId;
    public double hourlyRate;
    public boolean fullTime;

    public Server(String name, int employeeId, double hourlyRate, boolean fullTime) {
        this.employeeId = employeeId;
        this.hourlyRate = hourlyRate;
        this.fullTime = fullTime;
        this.name = name;
    }


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





    public void takeOrder(){

        System.out.println(name+"is taking order" );

    }

    public void cleanTable(){

        System.out.println(name+"is cleaning table" );

    }


}
