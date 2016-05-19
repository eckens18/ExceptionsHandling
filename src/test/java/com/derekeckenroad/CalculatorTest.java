package com.derekeckenroad;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void addTest(){
        Calculator calculator = new Calculator();
        int expected = 4;
        int actual = calculator.add(2,2);
        assertEquals("add value should be 4",expected,actual);
    }

    @Test
    public void subtractTest(){
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = calculator.subtract(4,2);
        assertEquals("subtract value should be 4",expected,actual);
    }

    @Test
    public void multiplyTest(){
        Calculator calculator = new Calculator();
        int expected = 4;
        int actual = calculator.multiply(2,2);
        assertEquals("multiply value should be 4",expected,actual);
    }

    @Test
    public void divideTest(){
        Calculator calculator = new Calculator();
        int expected = 2;
        int actual = calculator.divide(4,2);
        assertEquals("divide value should be 2",expected,actual);
    }

    @Test
    public void squareRootTest(){
        Calculator calculator = new Calculator();
        double expected = 4.0;
        double actual = calculator.squareRoot(16);
        assertEquals("divide value should be 2",expected,actual,0);
    }

    @Test (expected = DivisionByZeroException.class)
    public void divideByZeroTest(){
        Calculator calculator = new Calculator();
        calculator.divide(10,0);
    }

    @Test (expected = ComplexNumberException.class)
    public void complecNumberTest(){
        Calculator calculator = new Calculator();
        calculator.squareRoot(-5);
    }
}
