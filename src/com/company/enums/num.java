package com.company.enums;

import java.util.Collections;
import java.util.stream.Collectors;

public class num {
        public static void main(String[] args) {
           recursiveSum(0);
        }
        public static void recursiveSum(int n) {
            System.out.println(n+" ");
            n++;
            recursiveSum(n);
        }
}
