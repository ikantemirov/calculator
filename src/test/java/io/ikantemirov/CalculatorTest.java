package io.ikantemirov;


import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class CalculatorTest {
    @Test
    public void cutFirstNumberTest() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.cutFirstNumber("-123/5").equals("-123"));
    }

    @Test
    public void additionTest() {
        Calculator calculator = new Calculator();
        assertEquals(89.99, calculator.addition(78.55, 11.44), 0);
    }

    @Test
    public void substractionTest() {
        Calculator calculator = new Calculator();
        assertEquals(1, calculator.substraction(5, 4), 0);
    }

    @Test
    public void multiplicationTest() {
        Calculator calculator = new Calculator();
        assertEquals(-7.99, calculator.multiplication(4.7, -1.7), 0);
    }

    @Test
    public void divisionTest() {
        Calculator calculator = new Calculator();
        assertEquals(2002, calculator.division(888888, 444), 0);
    }

}
