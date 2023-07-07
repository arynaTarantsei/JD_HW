package com.Homework22;

import com.Homework5.Fraction;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FractionTest {

    @Test
    public void testAdd() {
        Fraction fraction1 = new Fraction(3, 4);
        Fraction fraction2 = new Fraction(1, 2);

        Fraction sum = fraction1.add(fraction2);

        assertEquals(new Fraction(10, 8), sum);
    }

    @Test
    public void testMultiply() {
        Fraction fraction = new Fraction(3, 4);
        int number = 2;

        Fraction result = fraction.multiply(number);

        assertEquals(new Fraction(6, 4), result);
    }

    @Test
    public void testDivide() {
        Fraction fraction = new Fraction(3, 4);
        int number = 2;

        Fraction result = fraction.divide(number);

        assertEquals(new Fraction(3, 8), result);
    }
}






