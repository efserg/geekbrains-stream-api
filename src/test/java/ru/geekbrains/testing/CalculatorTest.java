package ru.geekbrains.testing;


import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    @Ignore("Деление пока тестировать не нужно")
    public void testDiv() {
        assertEquals(1, calculator.add(2, 2));
    }

}