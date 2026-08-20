//Complete Abstraction
package com.java.oops.inheritance.Interface;

public interface WiFi {
    default void connect(){
        System.out.println("This is the WiFi.");
    }
}

class Laptop implements WiFi, LAN{
    public void connect(){
        System.out.println("Laptop is connected to the WiFi.");
    }

    @Override
    public void hardConnect() {
        System.out.println("Laptop is connected tot he LAN");
    }
}

class Phone implements WiFi{
    public void connect(){
        System.out.println("Phone is connected to the WiFi.");
    }
}

interface LAN{
    void hardConnect();
}

class DriverCode{
    public static void main(String[] args) {
        Laptop l = new Laptop();
        Phone p = new Phone();
        p.connect();
        l.connect();
        l.hardConnect();
    }
}
