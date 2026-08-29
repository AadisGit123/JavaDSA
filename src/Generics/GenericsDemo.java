package Generics;

import java.util.ArrayList;

public class GenericsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(9);
        list.add(12);
        System.out.println(list);

    }
}
