package Exceptions;

public class NotFoundException extends RuntimeException{

    public NotFoundException(String message) {
        super(message);
    }
    public void NotAllowedToCreateCourse(String message){
        System.out.println(message);
    }
    
}
