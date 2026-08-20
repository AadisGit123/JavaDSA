package basics;

import java.util.Scanner;

public class Fact {

    static int fact(int n){
        if (n == 1) return 1;
        return n * fact(n -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        System.out.println(fact(n));
    }
}
