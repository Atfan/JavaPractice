package com.homework01;

public class Exercise11 {
    public static void main(String[] args) {
        PrintLine(5);
        PrintLine(5, "V");
        PrintLine(5, "V", '|');
        PrintLine(5, "H", '=');
    }

    private static void PrintLine(int dist){
        PrintLine(dist, "H", '*');
    }
    private static void PrintLine(int dist,  String nav){
        PrintLine(dist, nav, '+');
    }

    private static void PrintLine(int dist, String nav, char ch){
        for(int i = 0; i < dist; i++){
            System.out.print(ch);
            if(nav.equals("V")){
                System.out.println();
            }
        }
    }
}
