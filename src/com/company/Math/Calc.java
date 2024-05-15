package com.company.Math;

public class Calc {

    public static class Sum{
        private int Sum;
        public Sum(int a, int b){
            Sum = a + b;
        }
        public int getSum(){
            return Sum;
        }
        @Override
        public String toString(){
            return ""+ Sum;
        }
    }
    public static class Minus{
        private int Minus;
        public Minus(int a, int b){
            Minus = a - b;
        }
        public int getMinus(){
            return Minus;
        }
        @Override
        public String toString(){
            return ""+ Minus;
        }
    }
}
