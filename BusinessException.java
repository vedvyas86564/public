package exceptionhandling;

public class BusinessException extends Exception {
    public BusinessException(Exception e) {
        super(e);
    }
}
