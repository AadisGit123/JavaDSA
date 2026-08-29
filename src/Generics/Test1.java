package Generics;

class Demo1<T>{
    T objVar;
    Demo1(T para){
        this.objVar = para;
    }
    void printValue(){
        System.out.println(objVar);
    }
}

public class Test1 {
    public static void main(String[] args) {
        Demo1<Integer> obj1 = new Demo1<>(10);
        Demo1<String> obj2 = new Demo1<>("Aaditya");
        obj1.printValue();
        obj2.printValue();
        obj1.objVar = 12;
        obj2.objVar = "Rajath";
        obj1.printValue();
        obj2.printValue();
    }
}

