package com.foxminded.vitaliifedan.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    static Calculator calculator;

    @BeforeAll
    static void setup() {
        calculator = new Calculator();
    }

    @Test
    void Should_Exception_When_GetDivisorZero() {
        IllegalArgumentException thrown = Assertions.assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(3, 0));
        Assertions.assertEquals("Divisor cannot be 0, division by zero", thrown.getMessage());
    }

    @Test
    void Should_ReminderOne_When_GetDividendLessThanDivisor() {
        Result result = calculator.divide(4, 10);
        Assertions.assertEquals(1, result.getReminder());
    }

    @Test
    void Should_QuotientZero_When_GetDividendLessThanDivisor() {
        Result result = calculator.divide(4, 10);
        Assertions.assertEquals(0, result.getQuotient());
    }

    @Test
    void Should_ResultWithPositiveDividend_When_GetNegativeDividendInInput() {
        Result result = calculator.divide(-20, 10);
        Assertions.assertEquals(20, result.getDividend());
    }

    @Test
    void Should_ResultWithPositiveDivisor_When_GetNegativeDivisorInInput() {
        Result result = calculator.divide(20, -10);
        Assertions.assertEquals(10, result.getDivisor());
    }


}
