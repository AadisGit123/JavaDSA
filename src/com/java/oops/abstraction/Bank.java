//Partial_Abstraction_2
package com.java.oops.abstraction;

class DriverClass {
    public static void main(String[] args) {
        HDFC hdfc = new HDFC();
        SBI sbi = new SBI();

        System.out.println(sbi.ROI());
        SBI.termsAndConditions();
        HDFC.termsAndConditions();
    }
}

abstract class RBI{

    abstract int ROI();

    void welcomeMessage(){
        System.out.println("Welcome!");
    }

    static void termsAndConditions(){
        System.out.println("Some Terms and Conditions Applied.");
    }
}

class HDFC extends RBI{
    int ROI(){
        return 6;
    }
}

class SBI extends RBI{
    int ROI(){
        return 10;
    }
}

