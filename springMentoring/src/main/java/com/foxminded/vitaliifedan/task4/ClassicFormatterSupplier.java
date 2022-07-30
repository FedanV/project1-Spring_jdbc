package com.foxminded.vitaliifedan.task4;

public class ClassicFormatterSupplier implements FormatterSupplier {
    @Override
    public String name() {
        return "classic";
    }

    @Override
    public Formatter get() {
        return new ClassicFormatter();
    }
}