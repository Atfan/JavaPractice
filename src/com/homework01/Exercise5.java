package com.homework01;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(;;){
            System.out.println("Введіть номер місяця(exit для виходу): ");
            String input = scanner.nextLine();
            if(input.equals("exit")){
                return;
            }
            else {
                Stage( Integer.parseInt(input));
            }
        }
    }
    private static void Stage(int m){
        switch (m){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
}
