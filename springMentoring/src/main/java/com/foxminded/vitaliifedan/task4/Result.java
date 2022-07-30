package com.foxminded.vitaliifedan.task4;

public class Result {

    private final int dividend;
    private final int divisor;
    private final int quotient;
    private final int reminder;

    public Result(int dividend, int divisor, int quotient, int reminder) {
        this.dividend = dividend;
        this.divisor = divisor;
        this.quotient = quotient;
        this.reminder = reminder;
    }

    public int getDividend() {
        return dividend;
    }

    public int getDivisor() {
        return divisor;
    }

    public int getQuotient() {
        return quotient;
    }

    public int getReminder() {
        return reminder;
    }

    @Override
    public String toString() {
        return "Result{" +
                "dividend=" + dividend +
                ", divisor=" + divisor +
                ", quotient=" + quotient +
                ", reminder=" + reminder +
                '}';
    }
}
