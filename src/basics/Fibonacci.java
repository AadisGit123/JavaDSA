package basics;

import java.util.Scanner;

public class Fibonacci {
//    static int fibonacci(int n) {
//        if (n <= 1) return n;
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//        int sum = 1;
//        System.out.print("Fibonacci series: ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(fibonacci(i) + " ");
//            sum += fibonacci(i);
//        }
//        System.out.println("\nSum: " + sum);
//    }
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        double sum = 1;
        double n1 = 0, n2 = 1;
        System.out.print("Fibonacci series: 0 1 ");
        for (int i = 0; i < n; i++) {
            sum = n1 + n2;
            System.out.print(sum + " ");
            n1 = n2;
            n2 = sum;
        }
        System.out.println("\nSum: " + sum);
    }
}
