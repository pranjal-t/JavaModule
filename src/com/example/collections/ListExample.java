package com.example.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListExample {

    public static void main(String args[])
    {
        List<Integer> listValues = new ArrayList<>();
        listValues.add(23);
        listValues.add(11);
        listValues.add(9);

        Collections.sort(listValues);

        System.out.println(listValues);

        Collections.sort(listValues, Collections.reverseOrder());

        System.out.println(listValues);
    }
}
