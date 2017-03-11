package Exceptions;

public class InvalidStringException extends RuntimeException {
    private static final String NULL_OR_EMPTY_VALUE = "Variable CANNOT be null or empty!";

    public InvalidStringException(){
        super(NULL_OR_EMPTY_VALUE);
    }

    public InvalidStringException(String message){
        super(message);
    }
}
