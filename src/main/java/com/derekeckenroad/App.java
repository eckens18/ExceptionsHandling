package com.derekeckenroad;

/**
 * Created by derekeckenroad on 5/19/16.
 */
public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        try {
            calculator.divide(5, 0);
        }
        catch(DivisionByZeroException e){
            e.printStackTrace();
        }
        try {
            calculator.squareRoot(-3);
        }
        catch(ComplexNumberException e){
           e.printStackTrace();
        }
    }
}
