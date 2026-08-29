package WrapperClasses;

public class WrapperDemo1 {
    public static void main(String[] args) {
        int x = 10;
        Integer obj = new Integer(x); // Manual Boxing.

        System.out.println("Primitive Value: " + x);
        System.out.println("Object Value: " + obj);
    }
}
