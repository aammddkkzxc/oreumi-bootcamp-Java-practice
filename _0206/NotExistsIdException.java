package _0206;

public class NotExistsIdException extends RuntimeException{
    public NotExistsIdException() {
        this("hi");
    }

    public NotExistsIdException(String message) {
        super(message);
    }
}
