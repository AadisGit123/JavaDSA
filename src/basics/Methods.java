package basics;

import java.util.Scanner;
public class Methods {
    public static void main(String[] args) {

//        P_N_1(10);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
//        int fib_sum = 0;
//        fib_sum = fib(n);
//        System.out.print(fib_sum);

//        int factorial = 0;
//        factorial = fact(n);
//        System.out.print(factorial);

        P_1_N(n);
    }

//    static void P_N_1 (int n){
//        if (n < 0) return;
//        System.out.println(n);
//        P_N_1(n-1);
//    }

//    static int fib(int n){
//        if(n <= 1) return n;
//        return fib(n - 1) + fib(n - 2);
//    }

//    static int fact(int n){
//        if(n == 0) return 1;
//        return n * fact(n - 1);
//    }

//    static int Armstrong(int n){
//        int dig = 0;
//        int dig_sum = 0;
//        int i = 0;
//        while(n != 0){
//            dig = n % 10;
//            dig_sum = math
//        }

    static void P_1_N(int n){
        if(n == 0) return;
        P_1_N(n-1);
        System.out.println(n);
    }
}

