package com.stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Collections.sort(list);
        for (int w : list) {
            if (w > 0 && w % 2 == 0) {
                System.out.print(w);
                System.out.print(" ");
            }
        }
    }

}
