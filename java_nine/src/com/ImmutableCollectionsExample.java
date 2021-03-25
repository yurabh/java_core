package com;

import java.util.List;
import java.util.Set;

public class ImmutableCollectionsExample {
    public static void main(String[] args) {
        List<String> names = List.of("Lokesh", "Amit", "John");

        System.out.println(names);

        Set<String> namesSet = Set.of("Lokesh", "Amit", "John");

        System.out.println(namesSet);
    }
}
