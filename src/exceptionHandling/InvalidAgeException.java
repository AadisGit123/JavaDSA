package exceptionHandling;

public class InvalidAgeException extends Exception {
    InvalidAgeException(String msg){
        super(msg);
    }
}

class Driver{
    public static void main(String[] args) throws InvalidAgeException {
        int age = 10;
        if (age < 18){
            throw new InvalidAgeException("Not Eligible - Access Denied.");
        }
        System.out.println("You can vote.");
    }


}
