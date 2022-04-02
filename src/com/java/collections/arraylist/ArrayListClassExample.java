package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListClassExample {
    public static void main(String[] args) {
        // created arrayList object
        List<String> fruits = new ArrayList<>(25);
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println(fruits);
    }
}
