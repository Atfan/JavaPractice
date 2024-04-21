package com.company;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        System.out.println("Введіть число від якого будемо брати відсоток: ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        scanner.skip("\n");
        System.out.println("Введіть відсоток: ");
        double b = scanner.nextDouble();
        System.out.println(Foo(a,b));
    }
    private static double Foo(double a, double b) {
        return a * (b/100);
    }
}
