package MurodilSessions.Week13.access.a;
/*
Create a class Computer in package access.a
        define the instance variables with access modifiers:
            os - public
            memory - protected
            brand - default
            has wifi card - private

        create a toString
 */
public class Computer {
    public String os;
    protected int memory;
    String brand;
    private boolean hasWifiCard;

    @Override
    public String toString() {
        return "Computer{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                ", brand='" + brand + '\'' +
                ", hasWifiCard=" + hasWifiCard +
                '}';
    }
}
