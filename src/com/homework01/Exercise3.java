package com.homework01;

import java.util.Objects;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        System.out.println(Foo());
    }
    private static int Foo() {
        Scanner scanner = new Scanner(System.in);
        int res = 0;
        for(;;) {
            System.out.println("Введіть число(якщо буде введено exit): ");
            String str = scanner.nextLine();
            if (Objects.equals(str, "exit")) {
                return res;
            } else {
                char digit = findFirstDigit(str);
                if (digit != '\0') {
                    res*=10;
                    res += digit-'0';
                } else {
                    System.out.println("Введено нечислове значення. Спробуйте ще раз.");
                }
            }
        }
    }
    public static char findFirstDigit(String input) {
        for (char c : input.toCharArray()) {
            if (Character.isDigit(c)) {
                return c;
            }
        }
        return '\0';
    }
}
