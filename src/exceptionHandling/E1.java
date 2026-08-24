package exceptionHandling;

public class E1 {
    public static void main(String[] args) {
        int i, j, k = 0;
        i = 10;
        j = 0;
//        try {
//            k = i/j;
//        } catch (ArithmeticException e){
//            System.out.println("Can't divide by zero.");
//        }
//        finally{
//            System.out.println("Good Luck!");
//        }
//        System.out.println("Division: " + k);

        try {
            k = i/j;
        } catch (IndexOutOfBoundsException e){
            System.out.println("Can't divide by zero.");
        }
        finally{
            System.out.println("Good Luck!");
        }
        System.out.println("Division: " + k);
    }
}
