package Exceptions;

public class AlreadyTeachingThisSubject extends RuntimeException{
    public AlreadyTeachingThisSubject(){
        System.out.println("You're already taking this cause");
    }

}
