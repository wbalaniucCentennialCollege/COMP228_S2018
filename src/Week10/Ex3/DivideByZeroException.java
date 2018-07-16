package Week10.Ex3;

public class DivideByZeroException extends ArithmeticException{
    public DivideByZeroException() {
        super("Attempted to divide by zero");
    }

    public DivideByZeroException(String message) {
        super(message);
    }
}
