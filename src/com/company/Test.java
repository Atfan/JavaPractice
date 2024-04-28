package com.company;

public class Test {
    public static void main(String[] args) {
        Integer[] arg = {1, 2, 3, 4, 5};
        Integer[] result = {0};
        Sum(result, arg);
        System.out.println(result[0]);
    }

    private static void Sum(Integer[] res, Integer... args) {
        for (Integer i : args) {
            res[0] += i;
        }
    }
}
