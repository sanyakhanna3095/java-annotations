package com.bridgelabz.exerciseProblems;

import java.util.ArrayList;
import java.util.List;

public class UncheckedWarning {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Raw type list (no generics)
        List rawList = new ArrayList();

        rawList.add("Hello");
        rawList.add("World");
        rawList.add(123);

        for (Object item : rawList) {
            System.out.println(item);
        }
    }
}
