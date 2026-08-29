package Generics;

class Demo2<K, V>{
    K key;
    V value;

    Demo2(K key, V value){
        this.key = key;
        this.value = value;
    }
    void printValue(){
        System.out.println(key + " " + value);
    }
}

public class Test2 {
    public static void main(String[] args) {
        Demo2<String, Integer> obj1 = new Demo2<>("Aadi", 10);
        Demo2<String, Integer> obj2 = new Demo2<>("Rajath", 23);
        obj1.printValue();
        obj2.printValue();
    }
}
