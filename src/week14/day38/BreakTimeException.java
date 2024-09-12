package week14.day38;

public class BreakTimeException extends RuntimeException{
    public BreakTimeException() {
        super("It's a break Time");
    }

    public BreakTimeException(String message) {
        super(message);
    }
}
