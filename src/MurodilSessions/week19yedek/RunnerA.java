package MurodilSessions.week19yedek;

/*
Then make a class Runner in package access.a
        make a main method and create a Windows object.
        Check to see which variables are accessible based on their access modifier
 */
public class RunnerA {
    public static void main(String[] args) {
        Windows windows = new Windows();
        windows.os = "Windows";
        windows.memory = 32;
        windows.brand = "Dell";
        //windows.hasWifiCard = true;//not inherited
        windows.windowsVersion = "11";
        windows.gaming();

        Computer computer = new Computer();
        //computer.gaming(); Not accessible
    }
}

