package _0206;

import _0205.Run;

public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException() {

    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
