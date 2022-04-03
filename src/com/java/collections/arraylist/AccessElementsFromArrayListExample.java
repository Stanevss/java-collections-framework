package com.java.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

// How to check if an ArrayList is empty using the isEmpty() method.
// How to find the size of an ArrayList using the size() method.
// How to access the element at a particular index in an ArrayList using the get() method.
// How to modify the element at a particular in an ArrayList using set() method.
public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topProgrammingLanguages = new ArrayList<>();

        System.out.println("Is the topProgrammingLanguages list empty? : " + topProgrammingLanguages.isEmpty());

        topProgrammingLanguages.add("C");
        topProgrammingLanguages.add("Java");
        topProgrammingLanguages.add("C++");
        topProgrammingLanguages.add("Python");
        topProgrammingLanguages.add(".net");

        // Find the size of an ArrayList
        System.out.println("Here are the top " + topProgrammingLanguages.size()
                + " Programming Languages in the world");

        // Retrieve the element at a given index
        String bestProgrammingLang = topProgrammingLanguages.get(1);
        System.out.println("bestProgrammingLang => " + bestProgrammingLang);

        String secondProgrammingLang = topProgrammingLanguages.get(2);
        System.out.println("secondProgrammingLang => " + secondProgrammingLang);

        // Modify the element at a given index
        topProgrammingLanguages.set(4, "C#");
        System.out.println(topProgrammingLanguages);
    }

}
