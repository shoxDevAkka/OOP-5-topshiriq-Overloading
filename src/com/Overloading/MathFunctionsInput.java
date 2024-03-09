package com.Overloading;

public class MathFunctionsInput {
    public static void main(String[] args) {
        MathFunctions mathFunctions = new MathFunctions();

        System.out.println();
        System.out.println("Yig'indini topish :");

        System.out.println(mathFunctions.add(12,78));
        System.out.println(mathFunctions.add(12,7.8));
        System.out.println(mathFunctions.add(1.2,7.8));

        System.out.println();
        System.out.println("Ayirmani topish :");

        System.out.println(mathFunctions.sub(89,56));
        System.out.println(mathFunctions.sub(89,5.6));
        System.out.println(mathFunctions.sub(8.9,5.6));

        System.out.println();
        System.out.println("Ko'paytmani topish :");

        System.out.println(mathFunctions.multiply(45,56));
        System.out.println(mathFunctions.multiply(4.5,56));
        System.out.println(mathFunctions.multiply(4.5,5.6));

        System.out.println();
        System.out.println("Bo'linmani topish :");

        System.out.println(mathFunctions.div(90,18));
        System.out.println(mathFunctions.div(90,1.8));
        System.out.println(mathFunctions.div(9.6,1.8));

        System.out.println();
        System.out.println("Absolyut qiymat topish :");

        System.out.println(mathFunctions.abs(-789));
        System.out.println(mathFunctions.abs(-45.6));

        System.out.println();
        System.out.println("Kvadrat qiymat topish :");

        System.out.println(mathFunctions.pow(45));
        System.out.println(mathFunctions.pow(7.8));


    }
}
