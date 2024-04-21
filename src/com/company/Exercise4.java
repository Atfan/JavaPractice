package com.company;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        System.out.println("Введіть шестизначне число: ");
        Scanner scanner = new Scanner(System.in);
        int numb = scanner.nextInt();
        int[] arr = new int[6];
        int t=numb;
        for (int i = 5; i >= 0; i--) {
            arr[i] = t%10;
            t=t/10;
        }
        swap(arr);
        int result=0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i]*Math.pow(10,(arr.length-1-i));
        }
        System.out.println(result);
    }
    public static void swap(int[] arr) {
        int temp;
        for(int i = 0; i < 2; i++){
        temp = arr[i];
        arr[i] = arr[arr.length - 1-i];
        arr[arr.length -1-i] = temp;
        }
    }
}
