package com.company;

import java.util.Scanner;

public class Exercise8 {
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

        Print(arr[0],arr[1]);
    }

    private static void Print(int start, int end) {
        for (int x = 1; x < 10; x++) {
            for (int y = start; y <= end; y++) {
                System.out.print(y + "*" + x + " = " + x*y+'\t');
                if(x*y<10)
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
    private static void swap(int[] arr){
        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
    }

}
