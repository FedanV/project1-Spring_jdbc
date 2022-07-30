package com.foxminded.vitaliifedan.task4;

import java.util.HashMap;
import java.util.Map;

public enum FormatterFactory {

    INSTANCE();

    private final Map<String, FormatterSupplier> suppliers;

    FormatterFactory() {
        suppliers = new HashMap<>();
        register(new ClassicFormatterSupplier());
        register(new GermanFormatterSupplier());
    }

    private void register(FormatterSupplier supplier) {
        suppliers.put(supplier.name(), supplier);
    }

    public Formatter get(String name) {
        if (suppliers.containsKey(name)) {
            return suppliers.get(name).get();
        }
        throw new IllegalArgumentException("Formatter with name '" + name + "' not registered!");
    }

    public static FormatterFactory getInstance() {
        return INSTANCE;
    }
}
