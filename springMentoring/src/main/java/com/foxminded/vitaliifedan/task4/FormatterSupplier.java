package com.foxminded.vitaliifedan.task4;

import java.util.function.Supplier;

public interface FormatterSupplier extends Supplier<Formatter> {
    String name();
}
