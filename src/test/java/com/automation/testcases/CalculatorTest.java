package com.automation.testcases;

import com.ebay.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    (dataProvider = "validDivDataProvider")
    public void testValidDiv(double a, double b, double expected) {
        double result = calculator.div(a, b);
        assertEquals(result, expected, 0.001, "Invalid division result");
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testInvalidDiv() {
        Calculator calculator = new Calculator();
        int x = 10;
        int y = 0;
        calculator.div(x, y);
    }

    @DataProvider(name = "validDivDataProvider")
    public Object[][] validDivDataProvider() {
        return new Object[][] {
                { 10, 2, 5 },
                { 10, 3, 3.333 },
                { -10, 2, -5 },
                { 0, 1, 0 }
        };
    }

    @DataProvider(name = "invalidDivDataProvider")
    public Object[][] invalidDivDataProvider() {
        return new Object[][] {
                { 10, 0 },
                { 0, 0 },
                { Double.POSITIVE_INFINITY, 1 },
                { Double.NEGATIVE_INFINITY, 1 },
                { Double.NaN, 1 }
        };
    }
}
