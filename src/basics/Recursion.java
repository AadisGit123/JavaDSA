package basics;

import java.util.Scanner;

public class Recursion {

//    static void function(int n, int f){
//        System.out.println(n);
//        if (n == f) return ;
//        function(n + 1, f);
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n, f;
//        n = sc.nextInt();
//        f = sc.nextInt();
//        function(n, f);
//    }
//    static int Sum(int n, int sum){
//    if (n == 1) return ++sum;
//    return Sum(n - 1, sum+=n);
//}
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n, sum = 0;
//        n = sc.nextInt();
//        System.out.println(Sum(n, sum));
//    }
    static int Sum(int n){
    if (n == 0) return 0;
    return  n + Sum(n - 1);
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(Sum(n));
    }
}
