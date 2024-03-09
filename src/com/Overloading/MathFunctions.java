package com.Overloading;

public class MathFunctions {

    public long add(long a, long b){
        return a + b;
    }

    public double add(double a, double b){
        return a + b;
    }

    public long sub(long a, long b){
        return a - b;
    }

    public double sub(double a, double b){
        return a - b;
    }

    public long multiply(long a, long b){
        return a*b;
    }

    public double multiply(double a, double b){
        return a*b;
    }

    public double div(long a, long b){
        return (double) a/b;
    }

    public double div(double a, double b){
        return a/b;
    }

    public long abs(long a){
        if (a<0){
            return -a;
        }
        return a;
    }

    public double abs(double a){
        if (a<0){
            return -a;
        }
        return a;
    }

    public long pow(long a){
        return a*a;
    }

    public double pow(double a){
        return a*a;
    }

}
