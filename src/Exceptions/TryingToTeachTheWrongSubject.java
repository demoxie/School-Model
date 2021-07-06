package Exceptions;

public class TryingToTeachTheWrongSubject extends Throwable {
    public TryingToTeachTheWrongSubject() {
        System.out.println("You can't teach this subject because it belongs to different department");
    }
}
