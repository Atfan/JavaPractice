package com.homework01;

public class Exercise9 {
    public static void main(String[] args) {
        int[] arr = new int[100];
        FillArray(arr);
        AnalizArray(arr);
    }
    private static void FillArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*200-100);
        }
    }
    private static void AnalizArray(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int counterNegativ=0;
        int counterPositiv=0;
        int counterZero=0;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i]>max) {
                max = arr[i];
            }
            if (arr[i]<min) {
                min = arr[i];
            }
            if (arr[i]>0) {
                counterPositiv++;
            }
            if (arr[i]<0) {
                counterNegativ++;
            }
            if (arr[i]==0) {
                counterZero++;
            }
        }
        System.out.println("Максимальний елемент в масиві: "+max);
        System.out.println("Мінімальний елемент в масиві: "+min);
        System.out.println("Кількість від'ємних елементів в масиві: "+counterPositiv);
        System.out.println("Кількість позитивних елементів в масиві: "+counterNegativ);
        System.out.println("Кількість нулів в масиві: "+counterZero);
    }
}
