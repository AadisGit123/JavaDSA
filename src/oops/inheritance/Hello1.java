package oops.inheritance;

public interface Hello1 {
    default void greet(){
        System.out.println("Good Morning!");
    }
}
