package com.company;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            System.out.println("Введіть кількість метрів: ");
            double metr = scanner.nextDouble();
            scanner.nextLine();
            System.out.println("Введіть бажану метрику(exit для виходу): ");
            String choise = scanner.nextLine().toLowerCase();
            switch (choise) {
                case "mil":
                    System.out.println(MInMil(metr)+" "+choise+" в "+metr+" m");
                    break;
                case "inc":
                    System.out.println(MInInc(metr)+" "+choise+" в "+metr+" m");
                    break;
                case "yd":
                    System.out.println(MInYd(metr)+" "+choise+" в "+metr+" m");
                    break;
                case "exit":
                    return;
                default:
                    System.out.println("Невідомий одиниця виміру.");
            }
        }

    }

    private static double MInMil(double m){
        return m*0.00062137;
    }

    private static double MInInc(double m){
        return m*39.3701;
    }

    private static double MInYd(double m){
        return m*1.0936;
    }

}