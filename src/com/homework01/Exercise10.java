package com.homework01;

public class Exercise10 {
    public static void main(String[] args) {

        int[] arr = new int[100];
        FillArray(arr);
        int[][] res = CreateArray(arr);
        System.out.print("Масив парних значень: ");
        PrintArray(res[0]);
        System.out.print("Масив непарних значень: ");
        PrintArray(res[1]);
        System.out.print("Масив додатних значень: ");
        PrintArray(res[2]);
        System.out.print("Масив від'ємних значень: ");
        PrintArray(res[3]);
    }
    private static void FillArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*200-100);
        }
    }
    private static int[][] CreateArray(int[] arr) {
        int counterOdd = 0;
        int counterEven = 0;
        int counterNegativ = 0;
        int counterPositiv = 0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                counterEven++;
            }
            if (arr[i] % 2 == 1) {
                counterOdd++;
            }
            if (arr[i] > 0) {
                counterPositiv++;
            }
            if (arr[i] < 0) {
                counterNegativ++;
            }
        }
        int [][] result = new int[4][];
        result[0] = new int[counterEven];
        result[1] = new int[counterOdd];
        result[2] = new int[counterPositiv];
        result[3] = new int[counterNegativ];
        int[] iterForMassive = new int[4];
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                result[0][iterForMassive[0]++] = arr[i];
            }
            if (arr[i] % 2 == 1) {
                result[1][iterForMassive[1]++] = arr[i];
            }
            if (arr[i] > 0) {
                result[2][iterForMassive[2]++] = arr[i];
            }
            if (arr[i] < 0) {
                result[3][iterForMassive[3]++] = arr[i];
            }
        }

        return result;

    }
    private static void PrintArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
