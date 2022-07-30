package com.foxminded.vitaliifedan.task4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ClassicFormatterTest {

    static Calculator calculator;
    static Formatter formatter;

    @BeforeAll
    static void setup() {
        calculator = new Calculator();
        formatter = FormatterFactory.getInstance().get("classic");
    }

    @Test
    void Should_QuotientIsOne_When_GetDividendAndDivisorTheSame() {
        Result result = calculator.divide(100, 100);
        String expectResult = "_100│100\n" + " 100│-\n" + " ---│1\n" + "   0\n";
        String actualResult = formatter.format(result);
        Assertions.assertEquals(expectResult, actualResult);
    }

    @Test
    void Should_QuotientEqualsDividend_When_GetDivisorOne() {
        Result result = calculator.divide(1234, 1);
        String expectResult = "_1234│1\n" +
                " 1   │----\n" +
                " -   │1234\n" +
                " _2\n" +
                "  2\n" +
                "  -\n" +
                "  _3\n" +
                "   3\n" +
                "   -\n" +
                "   _4\n" +
                "    4\n" +
                "    -\n" +
                "    0\n";
        String actualResult = formatter.format(result);
        Assertions.assertEquals(expectResult, actualResult);
    }

    @Test
    void Should_QuotientEqualsZero_When_GetDividendZero() {
        Result result = calculator.divide(0, 1234);
        String expectResult = "0 / 1234 = 0";
        String actualResult = formatter.format(result);
        Assertions.assertEquals(expectResult, actualResult);
    }

    @Test
    void Should_QuotientEqualsZero_When_GetDividendLessThanDivisor() {
        Result result = calculator.divide(123, 12345);
        String expectResult = "123 / 12345 = 0";
        String actualResult = formatter.format(result);
        Assertions.assertEquals(expectResult, actualResult);
    }

    @Test
    void Should_ClassicFormattedString_When_GetPositiveDividendAndDivisor() {
        Result result = calculator.divide(10000123, 10);
        String expectResult = "_10000123│10\n" +
                " 10      │-------\n" +
                " --      │1000012\n" +
                "     _12\n" +
                "      10\n" +
                "      --\n" +
                "      _23\n" +
                "       20\n" +
                "       --\n" +
                "        3\n";
        String actualResult = formatter.format(result);
        Assertions.assertEquals(expectResult, actualResult);
    }

}
