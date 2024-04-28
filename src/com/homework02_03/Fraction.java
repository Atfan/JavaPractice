package com.homework02_03;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new RuntimeException("Denominator is zero");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(0, 1);
    }


    public void Print() {
        Opti();
        if(numerator != denominator) {
            System.out.println(numerator + "/" + denominator);
        }else {
            System.out.println(1);
        }
    }
    public Fraction Add(Fraction second) {
        Fraction result = new Fraction();
        result.denominator = Nok(denominator, second.denominator);
        result.numerator = (numerator * (result.denominator / denominator)) +
                (second.numerator * (result.denominator / second.denominator));
        return result;
    }
    public Fraction Add(int source) {
        Fraction result = new Fraction();
        result.numerator = numerator + (source * denominator);
        result.denominator = denominator;
        return result;
    }
    public Fraction Subtract(Fraction second) {
        Fraction result = new Fraction();
        result.denominator = Nok(denominator, second.denominator);
        result.numerator = (numerator * (result.denominator / denominator)) -
                (second.numerator * (result.denominator / second.denominator));
        return result;
    }
    public Fraction SubtractInteger(int source) {
        Fraction result = new Fraction();
        result.numerator = numerator - (source * denominator);
        result.denominator = denominator;
        return result;
    }
    public Fraction Integersubtract(int source) {
        Fraction result=new Fraction();
        result.numerator = (source * denominator) -numerator;
        result.denominator = denominator;
        return result;
    }
    public Fraction Multiply(Fraction second) {
        Fraction result = new Fraction();
        result.denominator = denominator * second.denominator;
        result.numerator = numerator * second.numerator;
        return result;
    }
    public Fraction Multiply(int source) {
        Fraction result= new Fraction();
        result.denominator = denominator;
        result.numerator = numerator * source;
        return result;
    }
    public Fraction Divide(Fraction second) {
        Fraction result= new Fraction();
        result.denominator = second.numerator;
        result.numerator = second.denominator;
        result = Multiply(result);
        return result;
    }

    public Fraction FractiondivideInteger(int source) {
        Fraction result= new Fraction();
        if(source==0) {
            throw new RuntimeException("Divine by 0");
        }

        result.denominator = source;
        result.numerator = 1;
        result = Multiply(result);
        return result;
    }

    public Fraction IntegerdivideFraction(int source){

        Fraction result=new Fraction();
        result.setDenominator(1);
        result.setNumerator(source);
        Ratio();
        result = Multiply(result);
        return result;
    }



    private int Nod(int a, int b) {
        if(a == b) {
            return a;
        }
        if(a > b) {
            return Nod(a - b, b);
        }
        return Nod(a, b - a);
    }

    private int Nok(int a, int b) {
        return ((a * b)) / Nod(a, b);
    }

    private void Opti() {
        int nod;
        if(numerator > 0) {
            nod = Nod(numerator, denominator);
        }else {
            nod = Nod(((-1) * numerator), denominator);
        }
        numerator /= nod;
        denominator /= nod;

    }

    private void Ratio() {
        if(numerator == 0){
            throw new RuntimeException("Error: Numerator is zero");
        }
        int tmp=numerator;
        numerator = denominator;
        denominator = tmp;
    }

    //Setter&Getters
    public void setNumerator(int SourceNumerator) {
        numerator = SourceNumerator;
    }

    public void setDenominator(int SourceDenominator) {
        if(SourceDenominator!=0) {
            denominator = SourceDenominator;
        } else {
            throw new RuntimeException("Error: Denominator is zero");
        }
    }
}
