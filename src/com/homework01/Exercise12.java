package com.homework01;

public class Exercise12 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        FillArray(arr);
        sort(arr);
        PrintArray(arr);
        sort(arr, "desc");
        PrintArray(arr);
    }

    private static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void FillArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*200-100);
        }
    }

    public static void sort(int[] array) {
        sort(array,"asc");
    }
    public static void sort(int[] array, String choise) {

        if (choise.equals("desc")) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] < array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }else{
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        int temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
        }
    }

}
