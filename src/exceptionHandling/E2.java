package exceptionHandling;

import java.io.IOException;
import java.util.Scanner;

public class E2 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int[] arr = {1, 2, 3, 4, 5};
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            e.printStackTrace();
        }catch (Exception e){
            System.out.println("There's an error.");
        }finally{
            System.out.println("Good Luck!");
        }
    }
    //printStackTrace(): Tells us about the error encountered, the line number, and the Exception's name.
    //static: A block that is executed before the main block.
}
