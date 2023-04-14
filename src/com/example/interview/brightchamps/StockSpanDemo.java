package com.example.interview.brightchamps;

import java.util.Arrays;
import java.util.Stack;

public class StockSpanDemo {

    public static void main(String[] args) {

        int a[] = {80, 60, 100, 70, 60, 75, 85};

        int l = a.length;

        Stack<Integer> s = new Stack<>();

        s.push(0);

        int result[] = new int[l];

        Arrays.fill(result, 1);

        for (int i = 1; i < l; i++) {

            if (!s.isEmpty() && a[i] >= a[s.peek()]) {
                while (!s.isEmpty() && a[i] >= a[s.peek()]) {
                    s.pop();
                }

                if (!s.isEmpty())
                    result[i] = i - s.peek();
                else
                    result[i] += i;

            }
            s.push(i);

        }

        for (int i = 0; i < l; i++) {
            System.out.println(result[i]);
        }
    }
}
