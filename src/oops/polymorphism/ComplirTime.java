package oops.polymorphism;

public class ComplirTime {
    int add(int a, int b){
        System.out.print("Int: ");
        return a+b;
    }

    double add(double a, double b){
        System.out.print("Float: ");
        return (float)a+b;
    }

    int add(int a, int b,int c){
        System.out.print("Three: ");
        return  a+b+c;
    }

    public static void main(String[] args) {

        ComplirTime ad = new ComplirTime();
        int a = 5;
        double b = 6.8;
        int c = 7;
        System.out.println(ad.add(a, b));
        System.out.println(ad.add(a, c));
        System.out.println(ad.add(a, a, c));
    }
}
