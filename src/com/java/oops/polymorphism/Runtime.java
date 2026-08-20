package com.java.oops.polymorphism;

class Runtime {
    public static void main(String[] args) {
        Mom mom = new Mom();
        Daughter daughter = new Daughter();

        mom.cook();
        daughter.cook();
    }
}

class Mom{
    void cook(){
        System.out.println("Indian.");
    }
}

class Daughter extends Mom{
    void cook(){
        System.out.println("Chinese");
    }
}

