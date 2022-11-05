package edu.wctc;

public class CalculatorTestManual {
    public void testCalculator() {
        Calculator calc = new Calculator();

        double sum = calc.add(5.0, 4.0);

        if (sum != 9)
            System.out.println("Sum is incorrect");
        else
            System.out.println("sum is fine");

        double product = calc.multiply(5.0, -1.0);

        if (product != -5)
            System.out.println("Product is wrong");
        else
            System.out.println("Product is good");
    }
}
