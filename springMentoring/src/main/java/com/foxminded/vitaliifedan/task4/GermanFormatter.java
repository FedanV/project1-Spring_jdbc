package com.foxminded.vitaliifedan.task4;

public class GermanFormatter implements Formatter {

    @Override
    public String format(Result result) {

        if (result.getReminder() == 1) {
            return "" + result.getDividend() + " / " + result.getDivisor() + " = " + result.getQuotient();
        }

        Division division = new Division();
        StringBuilder stringResult = division.makeDivision(result.getDividend(), result.getDivisor());
        int[] index = new int[1];
        int j = 0;
        for (int i = 0; i < stringResult.length(); i++) {
            if (stringResult.charAt(i) == '\n') {
                index[j] = i;
                j++;
            }
            if (j == 1) {
                break;
            }
        }

        stringResult.insert(index[0], " ÷ " + result.getDivisor() + " => " + result.getQuotient());
        stringResult.replace(1, index[0], String.valueOf(result.getDividend()));


        return stringResult.toString();
    }
}
