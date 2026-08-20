//SINGLE LEVEL, MULTI-LEVEL, AND HIERARCHICAL.
package com.java.oops.inheritance;

public class Greeting {
    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.greet();
        Morning morning = new Morning();
        morning.greet();
        morning.greet2();
    }
}
