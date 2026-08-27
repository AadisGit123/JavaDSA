package basics.Arrays.Basics;

public class SumOdElements {
    public static void main(String[] args) {
        int [] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.println("Sum: " + sum);
    }
}
