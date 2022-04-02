package com.java.collections.arraylist;

// How to create an ArrayList from another collection using the
// ArrayList(Collection c) constructor

import java.util.ArrayList;
import java.util.List;

// How to add all the elements from an existing collection to the new
// ArrayList using the addAll() method.
public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        // create arraylist object
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers); // [2, 3, 5, 7, 11]

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        firstFivePrimeNumbers.addAll(nextFivePrimeNumbers); // 2, 3, 5, 7, 11, 2, 3, 5, 7, 11]

        System.out.println(firstFivePrimeNumbers);
    }
}
