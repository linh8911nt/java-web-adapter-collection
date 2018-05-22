package com.codegym;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>();
        numbers.add(41);
        numbers.add(1);
        numbers.add(0);
        numbers.add(8);
        numbers.add(3);
        numbers.add(2);
        numbers.add(10);

        CollectionOperations collectionOperations = new CollectionUtilsAdapter();
        Client client = new Client(collectionOperations);

        client.printMaxValue(numbers);
    }
}
