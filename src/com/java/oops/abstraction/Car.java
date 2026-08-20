//Abstraction
package com.java.oops.abstraction;

abstract class Car {
    abstract void start();
}

class BMW extends Car{
    void start(){
        System.out.println("BMW starts with a button");
    }
}

class Toyota extends Car{
    void start(){
        System.out.println("Toyota starts with a key");
    }
}

class DriverClass1 {
    public static void main(String[] args) {
        Car car = new Car() {
            @Override
            void start() {
                System.out.println();
            }
        };
    }
}

