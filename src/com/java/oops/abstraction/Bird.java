//Partial-Abstraction_1
package com.java.oops.abstraction;

abstract class Bird {

    abstract void move();

    void isAlive(){
        System.out.println("The bird is STILL ALIVE.");
    }

    void takingShit(){
        System.out.println("The Bird is taking Shit.");
    }

}

class Move extends Bird {

    @Override
    public void move() {
        System.out.println("The bird flies!");
    }

    @Override
    public void isAlive() {
        System.out.println("The bird is STILL ALIVE.");
    }

    @Override
    public void takingShit() {
        System.out.println("The Bird is taking Shit.");
    }
}

class DriverClass2 {
    public static void main(String[] args) {
        Move move = new Move();
        move.isAlive();
        move.takingShit();
        move.move();

    }
}
