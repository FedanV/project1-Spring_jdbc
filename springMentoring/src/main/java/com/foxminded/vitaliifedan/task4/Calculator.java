package com.foxminded.vitaliifedan.task4;

public class Calculator {

    public Result divide(int dividend, int divisor) {

        if (divisor == 0) {
            throw new IllegalArgumentException("Divisor cannot be 0, division by zero");
        }

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        int reminder = 0;
        int quotient = dividend / divisor;
        if (dividend < divisor) {
            return new Result(dividend, divisor, 0, 1);
        }

        return new Result(dividend, divisor, quotient, reminder);

    }
}
