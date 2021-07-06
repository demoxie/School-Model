package Exceptions;

public class NotAllowedToDoThis extends RuntimeException{
    private final String message;

    public NotAllowedToDoThis(String message) {
        this.message = message;
        System.out.println(message);
    }
    @Override
    public String getMessage() {
        return message;
    }
}
