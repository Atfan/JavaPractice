package com.homework01;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        int[] arr=new int[2];
        Scanner input = new Scanner(System.in);
        System.out.println("Введіть перше число: ");
        arr[0] = input.nextInt();
        System.out.println("Введіть друге число: ");
        arr[1] = input.nextInt();

        if(arr[0]>arr[1]){
            swap(arr);
        }

        Print(arr);
    }
    private static void Print(int[] arr){
        System.out.print("Не парні числа з діапазону від "+arr[0]+" до "+arr[1] +": ");
        for(int i = arr[0]; i <= arr[1]; i++){
            if(i % 2 == 1) {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
    }
    private static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }
}
