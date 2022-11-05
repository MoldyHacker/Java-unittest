package edu.wctc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @Test
    void add() {
//        Calculator calculator = new Calculator();
        double sum = calculator.add(5.0, 4.0);
        assertEquals(9.0, sum);
    }

    @Test
    void multiply() {
//        Calculator calculator = new Calculator();
        double product = calculator.multiply(5.0, -1.0);
        assertEquals(-5.0, product);
    }
}
