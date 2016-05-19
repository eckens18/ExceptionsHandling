package com.derekeckenroad;

public class Calculator {

    static int result = 0;

    public static int add(int a,int b){
        return result = a+b;
    }

    public static int subtract(int a,int b){
        return result = a-b;
    }

    public static int multiply(int a,int b){
        return result = a*b;
    }

    public static int divide (int a,int b) throws DivisionByZeroException {
        if (b == 0)
            throw new DivisionByZeroException("cannot divide by 0");
            return a/b;
    }

    public static double squareRoot(double a) throws ComplexNumberException{
        if(a<0)
            throw new ComplexNumberException("cannot divide by negative number");
        return Math.sqrt(a);
    }
}
