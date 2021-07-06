package Exceptions;

public class BelowTheRequiredException extends RuntimeException{
    public BelowTheRequiredException(String message){
        System.out.println(message);
    }
}
