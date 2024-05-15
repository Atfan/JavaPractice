package com.company.enums;

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
