package fon.master.calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorUtilTest {

    @Test
    public void testAddition() {
        CalculatorUtil calculator = new CalculatorUtil(2.0, 3.0);
        double result = calculator.addition();
        assertEquals(5.0, result, 0.0001);
    }

    @Test
    public void testSubtraction() {
        CalculatorUtil calculator = new CalculatorUtil(5.0, 3.0);
        double result = calculator.subtraction();
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testMultiplication() {
        CalculatorUtil calculator = new CalculatorUtil(2.0, 3.0);
        double result = calculator.multiplication();
        assertEquals(6.0, result, 0.0001);
    }

    @Test
    public void testDivision() {
        CalculatorUtil calculator = new CalculatorUtil(6.0, 3.0);
        double result = calculator.division();
        assertEquals(2.0, result, 0.0001);
    }

    @Test
    public void testDivisionByZero() {
        CalculatorUtil calculator = new CalculatorUtil(6.0, 0.0);
        double result = calculator.division();
        assertEquals(Double.POSITIVE_INFINITY, result, 0.0001);
    }

    @Test
    public void testOverflow() {
        double max = Double.MAX_VALUE;
        double result = new CalculatorUtil(max, max).addition();
        assertEquals(Double.POSITIVE_INFINITY, result, 0.0001);
    }
}