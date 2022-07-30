package com.foxminded.vitaliifedan.task4;

public class GermanFormatterSupplier implements FormatterSupplier {
    @Override
    public String name() {
        return "german";
    }

    @Override
    public Formatter get() {
        return new GermanFormatter();
    }
}