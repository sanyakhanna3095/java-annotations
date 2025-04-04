package com.bridgelabz.exerciseProblems;

import java.util.ArrayList;
import java.util.List;

public class UncheckedWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        List rawList = new ArrayList(); // Raw type list (no generics)

        rawList.add("Hello");
        rawList.add("World");
        rawList.add(123); // Mixing types (not type-safe)

        for (Object item : rawList) {
            System.out.println(item);
        }
    }
}
